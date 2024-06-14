package com.tk.d7;

public class MarkerInterfacedemo {
 public static void main(String args[])
 {
	 Student s=new Student(100,"taheer",78000.0,"java");
	 System.out.println(s);
	 if(s instanceof Registrable)
	 {
		 System.out.println("yes");
	 }
	 else
	 {
		 System.out.println("no");
	 }
	 
 }
}
