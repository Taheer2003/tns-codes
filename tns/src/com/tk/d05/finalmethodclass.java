package com.tk.d05;

public class finalmethodclass {
  //class with final method
	finalmethodclass()
	{
		System.out.println("this is a default constructor");
	}
	final int a=50;
	//final method 
	final void show()
	{
		System.out.println("value  of a:"+a);
	}
}
