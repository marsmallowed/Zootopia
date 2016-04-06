package antlr;

import org.antlr.v4.runtime.tree.ParseTree;

import antlr.GrammarParser.AddSubContext;
import antlr.GrammarParser.BooleanContext;
import antlr.GrammarParser.CharContext;
import antlr.GrammarParser.DatatypeContext;
import antlr.GrammarParser.FalseContext;
import antlr.GrammarParser.FloatContext;
import antlr.GrammarParser.Func_blockContext;
import antlr.GrammarParser.FunctionContext;
import antlr.GrammarParser.LiteralOpContext;
import antlr.GrammarParser.Main_funcContext;
import antlr.GrammarParser.MultDivModContext;
import antlr.GrammarParser.StringContext;
import antlr.GrammarParser.Void_funcContext;

public class BaseVisitor extends GrammarBaseVisitor
{
	ParseTree p;
	
	public BaseVisitor(ParseTree p)
	{
		this.p = p;
		
		try
		{
			this.visit(p);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("IM IN BASE VISITOR");
	}
	
	@Override
	public Object visitStart(GrammarParser.StartContext ctx)
	{
		System.out.println("IM IN START CLASS" + ctx.main_func().getText()); //main func na naka string
		//super.visit(ctx.main_func()); -> meaning kung ano next ivvisit na node
		if(ctx.func_block() != null)
			super.visit(ctx.func_block());
	
		return super.visit(ctx.main_func());
	}
//	
//	@Override
//	public Object visitFunc_block(Func_blockContext ctx) 
//	{
//		if(ctx.function() != null)
//			return super.visit(ctx.function());
//		return super.visitFunc_block(ctx);
//	}
//	
//	@Override
//	public Object visitFunction(FunctionContext ctx) {
//		if(ctx.void_func() != null)
//			return super.visit(ctx.void_func());
//		else if(ctx.ret_func() != null)
//			return super.visit(ctx.ret_func());
//		return super.visitFunction(ctx);
//	}
//	
//	@Override
//	public Object visitMain_func(Main_funcContext ctx) {
//		if(ctx.MainKey() != null)
//			return super.visit(ctx.code_block());
//		return super.visitMain_func(ctx);
//	}
//	
//	@Override
//	public Object visitDatatype(DatatypeContext ctx) {
//		if(ctx.IntKey() != null)
//			return super.visit(ctx.IntKey());
//		else if(ctx.FloatKey() != null)
//			return super.visit(ctx.FloatKey());
//		else if(ctx.CharKey() != null)
//			return super.visit(ctx.CharKey());
//		else if(ctx.StringKey() != null)
//			return super.visit(ctx.StringKey());
//		else if(ctx.BooleanKey() != null)
//			return super.visit(ctx.BooleanKey());
//		return super.visitDatatype(ctx);
//	}
//	
//	@Override
//	public Object visitInteger(antlr.GrammarParser.IntegerContext ctx) 
//	{
//		if(ctx.SubOp() != null)
//			return Integer.valueOf(ctx.Num().getText()) * -1;
//		else
//			return Integer.valueOf(ctx.Num().getText());
//	}
//	
//	@Override
//	public Object visitFloat(FloatContext ctx) {
//		if(ctx.SubOp() != null)
//			return Float.valueOf(ctx.Float().getText()) * -1;
//		else
//			return Float.valueOf(ctx.Float().getText());
//	}	
//	
//	@Override
//	public Object visitChar(CharContext ctx) {
//		return ctx.Char().getText().charAt(1);
//	}
//	
//	@Override
//	public Object visitString(StringContext ctx) {
//		//TODO: remove ~
//		return super.visitString(ctx);
//	}
//	
//	@Override
//	public Object visitTrue(antlr.GrammarParser.TrueContext ctx) 
//	{
//		return true;
//	};
//	
//	@Override
//	public Object visitFalse(FalseContext ctx) {
//		return false;
//	}
//	
//	@Override
//	public Object visitAddSub(AddSubContext ctx) {
//		//not sure
//		int left = (int) super.visit(ctx.expr(0));
//		int right = (int) super.visit(ctx.expr(1));
//		
//		if(ctx.AddOp() != null)
//			return left + right;
//		else
//			return left - right;
//	}
//	
//	@Override
//	public Object visitMultDivMod(MultDivModContext ctx) {
//		//not sure
//		int left = (int) super.visit(ctx.expr(0));
//		int right = (int) super.visit(ctx.expr(1));
//		
//		if(ctx.MultOp() != null)
//			return left * right;
//		else if(ctx.DivOp() != null)
//			return left / right;
//		else
//			return left % right;
//	}
}
