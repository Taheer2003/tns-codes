package com.tk.d03;

public class singleintdemo {

	//Program to demonstrate Single Inheritance 
	

		public static void main(String[] args) {
			
			Student student = new Student("Gayatri", "8080808080", "Bangalore", 9888878787L, 10, "City College");
			System.out.println(student);
			Student student1 = new Student();
			System.out.println(student1);
		}
	}
