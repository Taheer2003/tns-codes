package com.tk.d02;

public class Encapsulationdemo {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
        obj.setAge(21);
        obj.setName("taheer");
        obj.setSerialNum(113);
        
       System.out.println( obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getSerialNum());
        
        
	}

}
