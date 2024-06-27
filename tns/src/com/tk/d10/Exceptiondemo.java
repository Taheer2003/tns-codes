package com.tk.d10;

public class Exceptiondemo {

	public void demo()
	{
		int a=5/1;
		System.out.println(a);
	}
	public void slave()
	{
		try {
			demo();
			
		}
		catch(Exception e) {
			System.out.println("exception--->"+e);
		}
		finally {
			System.out.println("hello");
		}
	}
	public static void mian(String[] args)
	{
		Exceptiondemo obj= new Exceptiondemo();
		obj.slave();
	}
}


