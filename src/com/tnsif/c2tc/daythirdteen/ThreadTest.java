package com.tnsif.c2tc.daythirdteen;

public class ThreadTest extends Thread 
{
   public void run()
   {
	   for( int i = 0; i < 10; i++)
	   {
		   System.out.println(i);
	   }
   }
}
