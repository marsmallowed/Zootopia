package controller;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.BaseVisitor;
import antlr.CustomErrorListener;
import antlr.GrammarBaseListener;
import antlr.GrammarLexer;
import antlr.GrammarParser;

public class controller {

	 GrammarLexer lexer = null;
	 CustomErrorListener customErrorListener = null;
	 ParseTree tree;
     
	 public void lexerParser(String code)
	 {
		 try {
	       	ANTLRInputStream input = new ANTLRInputStream(code);
	       	
	       	customErrorListener = new CustomErrorListener();
	       	
	       	lexer = new GrammarLexer(input);
	       	
	       	lexer.removeErrorListeners();
	       	lexer.addErrorListener(customErrorListener);
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	
		 CommonTokenStream tokens = new CommonTokenStream(lexer);

		 GrammarParser p = new GrammarParser(tokens);
	       
	     p.removeErrorListeners();
	     p.addErrorListener(customErrorListener);
	       
	     p.setBuildParseTree(true);
	     p.addParseListener(new GrammarBaseListener());
	     tree = p.start();
	 }
	 
	 public void execute()
	 {
		 BaseVisitor base = new BaseVisitor(tree);
	 }
	 
	 public String getErrors()
	 {
		 if (customErrorListener.hasLexerErrors())
			 return customErrorListener.getLexerError();	
		 else if(customErrorListener.hasParserErrors())
			 return customErrorListener.getParserError();
		 
		 return "";
	 }
	 
	 
}
