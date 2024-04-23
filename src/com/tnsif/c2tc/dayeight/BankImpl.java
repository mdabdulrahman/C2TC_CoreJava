package com.tnsif.c2tc.dayeight;

public class BankImpl implements Bank {

	@Override
	public void deposit(Account account, double amount) {
		// TODO Auto-generated method stub
        if( amount > DEPOSIT_LIMIT )
        	System.err.println("Deposit is Not Possible!");
        else {
        	account.setBalance(account.getBalance()+amount);
        	System.out.println("Deposited : "+amount+" into account"+account.getAccNo());
        	
        }
	}

	@Override
	public void withdraw(Account account, double amount) {
		// TODO Auto-generated method stub
         if( account.getBalance() > amount ) 
         {
        	 if( account.getBalance()-amount>=MIN_BALANCE)
        	 {
        		 account.setBalance(account.getBalance()-amount);
        		 System.out.println("Withdraw "+amount+" from account"+account.getAccNo());
        	 }
        	 else {
        		 System.err.println("Account doesn't have minimum balance");
        	 }
         }
         else {
        	 System.out.println("Insufficient Balance!");
         }
	}

}
