package com.tk.d5;

public class finalvariable {
  final int x=123; // v should declare or else error occurs in final instance variable
  
  //declare and initialize a static blank final variable

  final static int y=321;
  final static int z=11;
  
  //instance method
 /* void change()
  {
	   x=30;//final variable cannot be re assign
	   y=20;
  }*/
  @Override
  public String toString()
  {
	  return "finalvariable x="+x+",y"+y+"]";
  }
  //declare a static block to intialized the final static variable
  /*static
  {
	  y=200;
	  z=100;
	  System.out.println("value of y:"+y);
  }*/
  
}
