package com.tk.d12;

public class MyChildThread extends Thread{
	@Override
 public void run()
 {
	 System.out.println("before runnable run() thread is alive or not"+ this.isAlive());
	 int no=0;
	 while(no<4)
	 {
		no++;
		System.out.println("number"+no);
		try {
			sleep(500);
		}catch(InterruptedException e)
		{
			System.err.println("thread interrupted"+e);
		}
	 }
	
 }
}
