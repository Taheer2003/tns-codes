package com.tk.d13;

class counter
{
	private int count;
	
	public void increment()
	{
		
		count=count+1;
		
	}
	public int getcount()
	{
		return count;
	}
}
public class synchronization { // syn is used for thread safe , it allows only one thread at a time

	public static void main(String[] args)throws InterruptedException {
		counter c= new counter();
		Thread t1=new Thread(()->
		{
			for(int i=0;i<20;i++)
			{
				c.increment();
			}
		}
				);
		Thread t2=new Thread(()->
		{
			for(int i=0;i<20;i++)
			{
				c.increment();
			}
		}
				);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.getcount());
		
	}

}
