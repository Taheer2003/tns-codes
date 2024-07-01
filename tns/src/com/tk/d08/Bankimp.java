package com.tk.d08;

public class Bankimp implements Bank {
  
	@Override
	public void deposit(Account account,double amount)
	{
		if(amount>deposit_limit)
		{
			System.out.println("deposit not possible");
		}
		else
		{
			account.setbal(account.getbal()+amount);
			System.out.println("deposite "+amount);
		}
		
	}
	@Override
	public void withraw(Account account,double amount)
	{
		if(account.getbal()-amount>=min_bal)
		{
			account.setbal(account.getbal()-amount);
			System.out.println("withraw"+amount);
		}
		
	}
   	 
}
