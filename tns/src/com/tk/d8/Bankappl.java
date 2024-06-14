package com.tk.d8;

public class Bankappl {

	public static void main(String[] args) {
		Bank bank =new Bankimp();//Bank is interface v cannot create a obj of it v are creating refernce of it
		//access the account class
		Account account =new Account(567898765,"taheer",56000.0,bank);
		//deposit money
		account.deposit(2000);
		System.out.println(account);
		account.withraw(4000);
		System.out.println(account);
		
	}

}
