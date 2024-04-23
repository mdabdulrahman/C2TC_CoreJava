package com.tnsif.c2tc.dayeight;

public class BankApplication 
{
   public static void main(String[] args)
   {
	    Bank bank = new BankImpl();
	    Account account = new Account(12345,"abu",20000,bank);
	    account.deposit(300);
   }
}
