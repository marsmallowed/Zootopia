package antlr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener
{	
	private List<String> errorLexer, errorParser;
	
	public CustomErrorListener()
    {
        this.errorLexer = new ArrayList<String>();
        this.errorParser = new ArrayList<String>();
    }
	
	public boolean hasParserErrors()
    {
        return this.errorParser.size() > 0;
    }
	
	public boolean hasLexerErrors()
    {
        return this.errorLexer.size() > 0;
    }
	
	public String getParserError()
	{
		String revisedError = this.errorParser.toString();
		
		revisedError = revisedError.substring(1, revisedError.length()-1);
		
		return revisedError;
	}

	public String getLexerError()
	{
		String revisedError = this.errorLexer.toString();
		
		revisedError = revisedError.substring(1, revisedError.length()-1);
		
		return revisedError;
	}
	
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
    	if(msg.contains("token recognition error"))
    	{
    		errorLexer.add("\n@Lexical Error: [" + line + ":" + charPositionInLine + "] " + msg);
    	}
    	else
    	{
    		errorParser.add("\n@Syntax Error: [" + line + ":" + charPositionInLine + "] " + msg);
    	}
    }
}