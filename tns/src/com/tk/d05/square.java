package com.tk.d05;

public class square extends shape {
  private float side;
  public square()
  {
	  side=2.0f;
  }
  public square(float side)
  {
	  this.side=side;
  }
  @Override
  void calArea()
  {
	  super.area =side*side;//allow reference to parent class -- super
  }
}
