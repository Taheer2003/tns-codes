package com.tk.d10;

public class uncheckedexception {
    public static void main(String args[])
    {
    	int x[]; 
    	try
    	{
    		x=new int[] {1,2,3,4};
    		System.out.println(x[6]);
    	}catch(ArrayIndexOutOfBoundsException e) {
    		System.err.println("specified index does not find"+e.getMessage());
    		//system.err also can we go but in red color
    	}
    }
}
