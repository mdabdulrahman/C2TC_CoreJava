package com.tnsif.c2tc.daythirdteen;

class ThreadFour extends Thread
{
	public static void threadInfo()
	{
		Thread ct = Thread.currentThread();
		System.out.println(Thread.activeCount());
		System.out.println("Thread Id : "+ct.threadId());
		System.out.println("Thread Name :"+ct.getName());
		System.out.println("Thread Priority : "+ct.getPriority());
	}
	public void run()
	{
		threadInfo();
		for( int i = 0; i < 100; i++)
			System.out.println(i);
	}
}
public class MyThread
{
 public static void main( String[] args)
 {
	 
	 ThreadFour.threadInfo();
	 System.out.println(Thread.currentThread());
	 ThreadFour th4 = new ThreadFour();
	 th4.setName("Th4");
	 th4.setPriority(10);
	 th4.start();
	 for(int i = 0;i<10;i++)
		 System.out.println(i);
	 
	 
 }
}

