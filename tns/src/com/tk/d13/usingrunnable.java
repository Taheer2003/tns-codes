package com.tk.d13;

public class usingrunnable implements Runnable {
     Thread thread;
     int high,low;   //instance variable -- outside the method inside the class
     String msg;
     public usingrunnable(int low ,int high,String msg)
     {
    	 this.high=high;
    	 this.low=low;
    	 this.msg=msg;
    	 thread =new Thread(this,"child thread");  //created thread for constructor
    	 thread.start();
    			 
     }
     @Override
     public void  run()
     {
    	 for(int i=low;i<=high;i++)
    	 {
    		 try {
    			 Thread.sleep(500);
    		 }
    		 catch(InterruptedException e)
    		 {
    			 System.out.println("error"+e);
    		 }
    		 System.out.println(msg+i);
    	 }
     }
}
