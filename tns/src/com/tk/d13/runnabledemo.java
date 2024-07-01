package com.tk.d13;

public class runnabledemo {

	public static void main(String[] args) {
		//using implement table class : used to declare a class that implements an interface
		usingrunnable obj = new usingrunnable(10,20,"hi");
		Runnable runnable =new Runnable() {   //extends :thread , implements : runnable
			@Override
			public void run()
			{
				System.out.println("runnable with anonymous class");
			}
		};
		Thread thread =new Thread(runnable);  // created thread for runnable
		thread.start();
		runnable = ()->{
			System.out.println("runnable with lamda ");
		};
		new Thread(runnable).start();
		System.out.println("----------");
		
		
			int n=5;
		
		
		runnable =()->
		{
			try
			{
				for(int i=1;i<=n;i++)
				{
					System.out.println("loop iteration:" +i);
					Thread.sleep(700);
				}
			}
			catch(InterruptedException e)
			{
				System.out.println("task interrupted"+e);
			}
		};
		new Thread(runnable).start();
				
	}

}
