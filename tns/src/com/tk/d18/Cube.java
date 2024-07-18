package com.tk.d18;

//Program to demonstrate Functional Interface



@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}