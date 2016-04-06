package controller;

public class Symbol
{	
	private String name;
	private Datatype datatype;
	private Object value;
	private Scope scope; //owning scope
	
	public Symbol(String name, Datatype datatype, Object value)
	{
		this.name = name;
		this.datatype = datatype;
		this.value = value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Datatype getDatatype()
	{
		return datatype;
	}
	
	public void setDatatype(Datatype datatype)
	{
		this.datatype = datatype;
	}
	
	public Object getValue()
	{
		return value;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
	
	public Scope getScope()
	{
		return scope;
	}
	
	public void setScope(Scope scope)
	{
		this.scope = scope;
	}
	
	public String toString()
	{
		if(datatype != null)
			return "<" + name + ":" + datatype + ">";
		return name;
	}
}
