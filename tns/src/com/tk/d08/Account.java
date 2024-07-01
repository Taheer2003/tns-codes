package com.tk.d08;

public class Account {
  private int accno;
  private String name;
  private double bal;
  private Bank bank;
  
  public Account(int accno, String name,double bal,Bank bank)
  {
	  this.accno=accno;
	  this.name=name;
	  this.bal=bal;
	  this.bank=bank;
  }
  public int getaccno()
  {
	  return accno;
  }
  public String getname()
  {
	  return name;
  }
  public double getbal()
  {
	  return bal;
  }
  public Bank getbank()
  {
	  return bank;
  }
  
  public void deposit(double amount)
  {
	  bank.deposit(this,amount);
  }
 public void withraw(double amount)
 {
	 bank.withraw(this,amount);
 }
  
  
  
  public void setaccno(int accno)
  {
	  this.accno=accno;
  }
  public void setname(String name)
  {
	  this.name=name;
  }
  public void setbal(double bal)
  {
	  this.bal=bal;
  }
  public void setbank(Bank bank)
  {
	  this.bank=bank;
  }
  @Override
  public  String toString()
  {
	  return "Account [accno="+accno+",name ="+name+",bal="+bal+"]";
  }
	  
  
}
