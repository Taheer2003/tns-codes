package com.tk.d05;

public class myclass {
   private int section;
   private static int srno;
   
   static 
   {
	   System.out.println("---within static block---");
	   srno=1000;
   }
   //default constuctor
   myclass()
   {
	   System.out.println("---within---");
	   srno++;
	   section++;
   }
   @Override
   public String toString()
   {
	   return "myclass [serial no"+srno+",section="+section+"]";
   }
   //static method
   static void display()
   {
	  // System.out.println("section:"+section); cant access bcz section is non static
	   System.out.println("serial no:"+srno);
	   
   }
}
