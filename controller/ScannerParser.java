package controller;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.CustomErrorListener;
import antlr.GrammarBaseListener;
import antlr.GrammarLexer;
import antlr.GrammarParser;

public class ScannerParser {
	public static void main(String[] args) {
		 GrammarLexer lexer = null;
		 CustomErrorListener customErrorListener = null;
	        try {
	        	ANTLRFileStream input = new ANTLRFileStream("hello.txt");
	        	
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
	}
}
