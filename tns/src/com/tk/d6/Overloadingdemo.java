package com.tk.d6;

public class Overloadingdemo {

	public static void main(String[] args) {
		System.out.println("-------Constructor overloading----");
		Point p=new Point();
		System.out.println(p);
		Point p1=new Point(14,5f);
		System.out.println(p1);
		Point p2=new Point(14.5f,65.2f);
		System.out.println(p2);
		
		System.out.println("--method overloading--");
		System.out.println("addition int and int:" +MethodOverloading.addition(10,20));
		System.out.println("addition float and float:" +MethodOverloading.addition(10.4f,20.3f));
		System.out.println("addition int and float:" +MethodOverloading.addition(10,99.5f));
		System.out.println("addition float and int:" +MethodOverloading.addition(11.3f,20));
		System.out.println("addition string and string:" +MethodOverloading.addition("abc","def"));
		
		
		

	}

}
