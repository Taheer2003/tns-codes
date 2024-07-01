package com.tk.d05;

public class abstactdemo {
  public static void main(String args[])
  {
	  square s=new square();
	  rectangle r=new rectangle();
	  s.calArea();
	  s.show();
	  r.calArea();
	  r.show();
	  System.out.println("----");
	  //runtime polymorphism
	  shape shape;
	  shape =new square(12.5f);
	  shape.calArea();
	  shape.show();
	  shape =new rectangle(11,13);
	  shape.calArea();
	  shape.show();
  }
}
