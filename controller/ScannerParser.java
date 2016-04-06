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

import view.GUI;
import antlr.BaseVisitor;
import antlr.CustomErrorListener;
import antlr.GrammarBaseListener;
import antlr.GrammarBaseVisitor;
import antlr.GrammarLexer;
import antlr.GrammarParser;

public class ScannerParser 
{
	
	public static void main(String[] args) 
	{	
		GUI view = new GUI();
		view.setVisible(true);
		
//		 GrammarLexer lexer = null;
//		 CustomErrorListener customErrorListener = null;
//	        try {
//	        	ANTLRFileStream input = new ANTLRFileStream("Hello.txt");
//	        	
//	        	customErrorListener = new CustomErrorListener();
//	        	
//	        	lexer = new GrammarLexer(input);
//	        	
//	        	lexer.removeErrorListeners();
//	        	lexer.addErrorListener(customErrorListener);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//
//	        CommonTokenStream tokens = new CommonTokenStream(lexer);
//	        
//	        GrammarParser p = new GrammarParser(tokens);
//	        
//	        p.removeErrorListeners();
//	        p.addErrorListener(customErrorListener);
//	        
//	        p.setBuildParseTree(true);
//	        p.addParseListener(new GrammarBaseListener());
//	        ParseTree tree = p.start();
//	        
//	        BaseVisitor v = new BaseVisitor(tree);
//	        //System.out.println(tree);
//	        
//	        if (customErrorListener.hasErrors())
//	        {
//	        	try
//	        	{
//	        		System.out.printf(customErrorListener.getError());	
//	        	}
//	        	catch(Exception e)
//	        	{
//	        		e.printStackTrace();
//	        	}
//	        }
	}
}
