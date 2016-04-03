package controller;

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import antlr.CustomErrorListener;
import antlr.GrammarBaseListener;
import antlr.GrammarLexer;
import antlr.GrammarParser;

public class ScannerParser {
	public static void main(String[] args) {
		 GrammarLexer lexer = null;
		 CustomErrorListener customErrorListener = null;
	        try {
	        	ANTLRFileStream input = new ANTLRFileStream("Hello.txt");
	        	
	        	customErrorListener = new CustomErrorListener();
	        	
	        	lexer = new GrammarLexer(input);
	        	
	        	lexer.removeErrorListeners();
	        	lexer.addErrorListener(customErrorListener);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        
	        GrammarParser p = new GrammarParser(tokens);
	        
	        p.removeErrorListeners();
	        p.addErrorListener(customErrorListener);
	        
	        p.setBuildParseTree(true);
	        p.addParseListener(new GrammarBaseListener());
	        ParseTree tree = p.start();
	        //System.out.println(tree);
	        
	        if (customErrorListener.hasErrors())
	        {
	        	try
	        	{
	        		System.out.printf(customErrorListener.getError());	
	        	}
	        	catch(Exception e)
	        	{
	        		e.printStackTrace();
	        	}
	        }
	        
	        //show AST in console
	        //System.out.println(tree.toStringTree(p));

	        //show AST in GUI
	        JFrame frame = new JFrame("Antlr AST");
	        JPanel panel = new JPanel();
	        
	        TreeViewer viewr = new TreeViewer(Arrays.asList(p.getRuleNames()),tree);
	        viewr.setScale(1.5);//scale a little
	        panel.add(viewr);
	        frame.add(panel);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(true);
	        frame.setSize(frame.getMaximumSize());
	        frame.setVisible(true);
	        
	        final JTextArea display = new JTextArea(16, 58);
	        display.setEditable(true);
	        JScrollPane scroll = new JScrollPane(display);
	        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	        panel.add(scroll);
	}
}
