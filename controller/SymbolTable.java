package controller;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
	
	protected Stack<Scope> scopeStack; 
	protected ArrayList<Scope> allScopes;
	protected Scope main;
	
	public SymbolTable()
	{
		init();
	}
	
	protected void init()
	{
		scopeStack = new Stack<>();
		allScopes = new ArrayList<>();
		
		Scope scope = new Scope(0, null);
		scopeStack.push(scope);
		allScopes.add(scope);
		main = scope;
	}
	
	//add new scope
	public Scope pushScope()
	{
		Scope enclosingScope = scopeStack.peek();
		Scope scope = new Scope(enclosingScope.getPosition() + 1, enclosingScope);
		scopeStack.push(scope);
		allScopes.add(scope);
		return scope;
	}
	
	//delete scope
	public  void popScope()
	{
		scopeStack.pop();
	}
	
	public Scope currentScope()
	{
		if(scopeStack.size() > 0)
			return scopeStack.peek();
		return allScopes.get(0);
	}
	
	public Scope getScope(int position)
	{
		for (Scope scope : scopeStack) 
		{
            if (scope.getPosition() == position) 
            	return scope;
        }
        return null;
	}
	
	 public String toString() 
	 {
	    StringBuilder sb = new StringBuilder();
	    for (Scope scope : scopeStack.subList(0, scopeStack.size() - 1)) 
	    {
	    	sb.append(scope.toString());
	    }
	    return sb.toString();
	}
}
