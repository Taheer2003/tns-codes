package com.tk.d07;

public class FuntionalInterfacedemo {
  public static void main(String args[])
  {
	  GreetClass g=new GreetClass();
	  System.out.println(g.greet());
	  //using lambda expression  --- lambda takes in parameter and return a value 
	  // similar to method but do any names can implement straight into body of a method 
	  GreetInterface g1=()->{         //() paramter ->expression
		  return "good afternoon";
	  };
	  System.out.println(g1.greet());
  }
}
