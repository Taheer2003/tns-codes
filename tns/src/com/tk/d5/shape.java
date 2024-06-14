package com.tk.d5;

public abstract class shape {
  protected float area;
  //abstract method
  abstract void calArea();
  void show()
  {
	  System.out.println("area is"+area);
  }
  
  
}
