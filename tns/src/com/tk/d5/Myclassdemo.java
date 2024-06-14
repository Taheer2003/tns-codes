package com.tk.d5;

public class Myclassdemo {

	public static void main(String[] args) {
		myclass  c1=new myclass();
		System.out.println(c1);
		//static method with class name
		myclass.display();
		
		myclass c2 = new myclass();
		System.out.println(c2);
		myclass.display();
		myclass c3 = new myclass();
		System.out.println(c3);
		myclass.display();
	}

}
