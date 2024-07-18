package com.tk.d17;

//Program to demonstrate lower bound wild card class


import java.util.List;

public class LowerBondedWildCard {
	//Parameter List(<?>) is List of Any Super Class Object of Integer
	public static void displayNumbers(List<? super Integer> list) // any super class of Integer class
	{
		for (Object n : list) {
			System.out.println(n);
		}
	}

}

