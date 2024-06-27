package com.tk.d12;

public class ThreadLifeCycleDemo {
 public static void main(String args[])
 {
	 MyChildThread myThread = new MyChildThread();
			 
		        System.out.println("before runnable stage thread is alive or not "+ myThread.isAlive());
		      myThread.start();
		      try {
					Thread.sleep(4000);
				}catch(InterruptedException e)
				{
					System.err.println("thread is interrupted..."+e);
				}
		      System.out.println("after complete execution of thread it is alive or not "+myThread.isAlive());
			 
 }
}
