package antlr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener
{	
	private List<String> items;
	
	public CustomErrorListener()
    {
        this.items = new ArrayList<String>();
    }
	
	public boolean hasErrors()
    {
        return this.items.size() > 0;
    }
	
	public String getError()
	{
		String revisedError = this.items.toString();
		
		revisedError = revisedError.substring(1, revisedError.length()-1);
		
		return revisedError;
	}
	
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
    	if(msg.contains("token recognition error"))
    	{
    		items.add("\n@Lexical Error\n\t" + "[" + line + ":" + charPositionInLine + "] " + msg);
    	}
    	else
    	{
			items.add("\n@Syntax Error\n\t" + "[" + line + ":" + charPositionInLine + "] " + msg);
    	}
    }
}