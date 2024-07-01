package com.tk.d07;

//class and class -- extends
//class and interface -- implements
//interface and interface -- extends

/*
//basic syntax of interface
interface A{
	//void show(); //abstract method
	int xyz=10;
}
//class ABC implements A{  it cannot bcz A has abstact so ABC also should be abstact
class ABC implements A{
	A obj = new ABC(); // cannot instantiate the interface 
}
*/
public class GreetClass implements GreetInterface{
  @Override 
  public String greet()
  {
	  return "welcome to the world of java";
  }
}
