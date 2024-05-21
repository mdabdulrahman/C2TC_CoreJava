package com.tnsif.c2tc.daythirdteen;

public class ThreadThree extends Thread
{
     public void run()
     {
    	 System.out.println("Thread Three is started running.........");
    	 for( int i = 0;i < 5;i++)
    	 {
    		 System.out.println("Thread Three : "+this.isAlive());
    		 try
    		 {
    			 sleep(500);
    		 }
    		 catch(InterruptedException e)
    		 {
    			 System.out.println(e);
    		 }
    		 
    	 }
     }
}
