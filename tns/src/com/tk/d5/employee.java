package com.tk.d5;

public class employee {
//declare instance variable
	private String name;
	private int id;
	
	//declare static variable
	static String companyname="tns";
	
	employee(String name ,int id)
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString()
	{
		return "employee [name ="+name+",id="+id+",company="+companyname+"]";
	}
	
}
