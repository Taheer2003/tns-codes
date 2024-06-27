package com.tk.d11;

public class ThreadDemo {
	//Executor class for ChildThread
	
		public static void main(String[] args) {
			ChildThread threadOne = new ChildThread(5, "First");
			ChildThread threadTwo = new ChildThread(10, "Second");
			System.out.println("current thread:"+Thread.currentThread());

			threadOne.start();
			//threadOne.start(); // throws IllegalStateException
			// threadOne.run(); // single threaded application 
			threadTwo.start();
			Thread.currentThread().setName("parent thread");//assing name to the thread
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);//changing priority of the thread
			System.out.println("current thread:"+Thread.currentThread());
			try
			{
				threadOne.join();//wait current thread until t1 is dead
				threadTwo.join(300);//wait current thread until t2 is dead or time period over
			}
			catch(InterruptedException e)//INTERRUPTED EXCETION V NEED JOIN AND SLLEP METHODS	
			{
				System.out.println("thread  interrupted" +e.getMessage());
			}

			System.out.println("-----------------------End of Main--------------------------");
		}
	}


