package com.tk.d6;

public class Overridingdemo {

	public static void main(String[] args) {
		RBI rbi;
		//dynamic binding assigning child obj to parent class references obj
		rbi =new SBI();
		System.out.println(rbi.getRateOfInterest());
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterest());
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
	}

}
