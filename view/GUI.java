package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTable;

import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;

import controller.controller;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame
{
	private JTextArea txtProgram;
	private JScrollPane programScroll;
	private JLabel lblProgram;

	private JTextArea txtStack;
	private JScrollPane stackScroll;
	private JLabel lblStack;
	
	private JTextArea txtSymbol;
	private JScrollPane symbolScroll;
	private JLabel lblSymbol;
	
	private JTextArea txtConsole;
	private JScrollPane consoleScroll;
	private JLabel lblConsole;
	
	private JButton btnExecuteAll;
	private JButton btnExecuteALine;
	
	controller control = new controller();
	String message = "";
	int index = 0;
	ArrayList<String> lines = new ArrayList<>();
	
	public GUI()
	{		
		//GUI components
		getContentPane().setLayout(null);
		
		this.setSize(780, 680);
		lblProgram = new JLabel("Type your program here:");
		lblProgram.setBounds(25, 25, 163, 20);
		getContentPane().add(lblProgram);
		
		programScroll = new JScrollPane((Component) null);
		programScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		programScroll.setBounds(25, 50, 446, 395);
		getContentPane().add(programScroll);
		
		txtProgram = new JTextArea();
		txtProgram.setWrapStyleWord(true);
		txtProgram.setRows(5);
		txtProgram.setLineWrap(true);
		txtProgram.setEditable(true);
		txtProgram.setColumns(50);
		programScroll.setViewportView(txtProgram);
		
		lblStack = new JLabel("Call Stack:");
		lblStack.setBounds(483, 27, 73, 20);
		getContentPane().add(lblStack);
		
		stackScroll = new JScrollPane((Component) null);
		stackScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		stackScroll.setBounds(483, 50, 255, 175);
		getContentPane().add(stackScroll);
		
		txtStack = new JTextArea();
		txtStack.setWrapStyleWord(true);
		txtStack.setRows(5);
		txtStack.setLineWrap(true);
		txtStack.setEditable(false);
		txtStack.setColumns(50);
		stackScroll.setViewportView(txtStack);
		
		lblConsole = new JLabel("Console:");
		lblConsole.setBounds(25, 448, 50, 20);
		getContentPane().add(lblConsole);
		
		consoleScroll = new JScrollPane((Component) null);
		consoleScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		consoleScroll.setBounds(25, 473, 713, 96);
		getContentPane().add(consoleScroll);
		
		txtConsole = new JTextArea();
		txtConsole.setWrapStyleWord(true);
		txtConsole.setRows(5);
		txtConsole.setLineWrap(true);
		txtConsole.setEditable(false);
		txtConsole.setColumns(50);
		consoleScroll.setViewportView(txtConsole);
		
		lblSymbol = new JLabel("Symbol Table:");
		lblSymbol.setBounds(483, 248, 97, 20);
		getContentPane().add(lblSymbol);
		
		symbolScroll = new JScrollPane((Component) null);
		symbolScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		symbolScroll.setBounds(483, 270, 255, 175);
		getContentPane().add(symbolScroll);
		
		txtSymbol = new JTextArea();
		txtSymbol.setWrapStyleWord(true);
		txtSymbol.setRows(5);
		txtSymbol.setLineWrap(true);
		txtSymbol.setEditable(false);
		txtSymbol.setColumns(50);
		symbolScroll.setViewportView(txtSymbol);
		
		btnExecuteAll = new JButton("Execute all");
		btnExecuteAll.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExecuteAll.setBounds(446, 582, 136, 36);
		getContentPane().add(btnExecuteAll);
		
		btnExecuteALine = new JButton("Execute a line");
		btnExecuteALine.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExecuteALine.setBounds(602, 582, 136, 36);
		getContentPane().add(btnExecuteALine);
		
		
		//listeners
		btnExecuteAll.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{	
				if(!txtProgram.getText().isEmpty())	
				{
					message = "";
					control.lexerParser(txtProgram.getText().toString());
					System.out.println("Lexer Parser");
					String error = control.getErrors();
					if(!error.isEmpty())
					{
						System.out.println("Error lexer");
						message += error;
						txtConsole.setText(message);
					}
					else
					{
						System.out.println("execute");
						control.execute();
						txtConsole.setText("Done executing!"); //eto muna for now
					}	
				}
			}
		});
		
		btnExecuteALine.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if(!txtProgram.getText().isEmpty())
				{
					btnExecuteAll.setEnabled(false);
					
					if(index == 0)
					{
						for (String line : txtProgram.getText().split("\\n")) 
							lines.add(line);
					}
					
					message = "";
					control.lexerParser(lines.get(index));
					System.out.println("Lexer Parser");
					String error = control.getErrors();
					if(!error.isEmpty())
					{
						System.out.println("Error lexer");
						message += error;
						txtConsole.setText(message);
					}
					else
					{
						System.out.println("execute");
						control.execute();
						txtConsole.setText("Done executing line " + index); //eto muna for now
					}	
					
					if(lines.size() == index + 1)
					{
						btnExecuteAll.setEnabled(true);
						index = 0;
					}
					else
						index++;
				}
			}
		});
	}
}
