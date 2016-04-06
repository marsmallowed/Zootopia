package controller;

import java.util.LinkedHashMap;
import java.util.Map;


public class Scope {
	
	private int position;
	private Scope enclosingScope;
	private Map<String, Symbol> symbolMap = new LinkedHashMap<String, Symbol>();
	
	public Scope(int position, Scope enclosingScope)
	{
		this.position = position;
		this.enclosingScope = enclosingScope;
	}
	
	//define symbol in the current scope
	public void define(String name, Datatype datatype, Object value)
	{
		Symbol symbol = new Symbol(name, datatype, value);
		symbol.setScope(this);
		symbolMap.put(symbol.getName(), symbol);
	}
	
	//look up the symbol name in this scope. If not, progressively search the enclosing scopes
	private Symbol resolve(String name)
	{
		Symbol symbol = symbolMap.get(name);
		if(symbol != null)
			return symbol;
		if(enclosingScope != null)
			return enclosingScope.resolve(name);
		return null; //if not found
	}
	
	public Boolean redeclare(String name, Object value)
	{
		Symbol symbol = symbolMap.get(name);
		if(symbol != null)
		{
			symbol.setValue(value);
			return true;
		}
		if(enclosingScope != null)
			return enclosingScope.redeclare(name, value);
		return false;
	}
	
	public Scope getEnclosingScope()
	{
		return enclosingScope;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public String toString()
	{
		return symbolMap.keySet().toString();
	}
	
}
