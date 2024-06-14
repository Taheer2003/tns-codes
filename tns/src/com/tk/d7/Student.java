package com.tk.d7;

public class Student implements Registrable {
  private int id;
  private String name;
  private double fees;
  private String course;
  
  //Default constructor
  Student()
  {
	  super();
	  
  }
  public Student(int id,String name,double fees,String course)
  {
	  super();
	  this.id=id;
	  this.name=name;
	  this.fees=fees;
	  this.course=course;
  }
  public int getId()
  {
	  return id;
  }
  public void  setId(int id)
  {
	  this.id=id;
  }
  public String getname()
  {
	  return name;
  }
  public void setname(String name)
  {
	  this.name=name;
  }
  public double getfees()
  {
	  return fees;
  }
  public void  setfees(double fees)
  {
	  this.fees=fees;
  }
  public String getcourse()
  {
	  return course;
  }
  public void setcourse(String course)
  {
	  this.course=course;
  }
  @Override
  public String toString()
  {
	  return "Student [id="+id+",name="+name+",fees="+fees+"course="+course+"]";
  }
  
}
