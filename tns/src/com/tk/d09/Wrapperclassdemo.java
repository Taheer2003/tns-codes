package com.tk.d09;

public class Wrapperclassdemo {

	public static void main(String[] args) {
		//autoboxing - automatic conversion of primitive datatypes
		//onboxing - is opposite of autoboxing
		
		
		//onboxing
		Integer i=new Integer(10); //wrapper - integer // unwrapper is only int
		System.out.println(i); //print
		int b=i.intValue(); //method primitive data
		System.out.println(b); //print
		
		//without using intvalue
		int c=i;
		System.out.println(c);
		
		//autoboxing
		int a=100;
		Integer i1=a; //i1 is name of the wrapper class or variable
		System.out.println(i1);
	}

}
