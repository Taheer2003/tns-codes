package com.tk.d18;

//Program to demonstrate Lambda Expression



public class WithoutLambdaExp { 
	  
	    public static void main(String[] args) {  
	        
	    	//without lambda, 
	    	//Message implementation using anonymous class  
	     
	        IStatement s=new IStatement() {
	        	public String show()
	        	{
	        		return "Welcome to Lambda Expression";
	        	}};
	        	
	        	System.out.println(s.show());
	        
	        		
	       
	    }  
	}  
