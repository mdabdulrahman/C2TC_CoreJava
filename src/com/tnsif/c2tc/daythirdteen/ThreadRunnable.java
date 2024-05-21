package com.tnsif.c2tc.daythirdteen;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() 
	{
	  System.out.println("Runnable thread is running..........");	
	  for( int i = 0; i < 10; i++)
	  {
		  System.out.println("run");
	  }

	}

}
