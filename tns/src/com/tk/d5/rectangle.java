package com.tk.d5;

public class rectangle extends shape{
  private float width,height;
  public rectangle()
  {
	  this.width=5.0f;
	  this.height=2.0f;
  }
  public rectangle(float width,float height)
  {
	  this.width=width;
	  this.height=height;
  }
  @Override
  void calArea()
  {
	  area =width*height;
  }
}
