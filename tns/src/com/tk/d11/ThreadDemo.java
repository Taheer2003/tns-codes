package com.tk.d11;

public class ThreadDemo {
	//Executor class for ChildThread
	
		public static void main(String[] args) {
			ChildThread threadOne = new ChildThread(5, "First");
			ChildThread threadTwo = new ChildThread(10, "Second");

			threadOne.start();
			//threadOne.start(); // throws IllegalStateException
			// threadOne.run(); // single threaded application 
			threadTwo.start();

			System.out.println("-----------------------End of Main--------------------------");
		}
	}


