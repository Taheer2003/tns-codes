package com.tk.d08;

public interface Bank {
  double min_bal=1000;
  double deposit_limit=50000;
  double interest_rate=7.8;
  
  void deposit(Account account,double amount);
  void withraw(Account account,double amount);
  
 
}
