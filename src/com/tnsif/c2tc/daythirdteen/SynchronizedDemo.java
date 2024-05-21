package com.tnsif.c2tc.daythirdteen;

class OneThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		Thread ct = Thread.currentThread();
		for( int i = 0; i < 10; i++)
		
		{
			System.out.println(ct.getName()+" - "+i);
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class SynchronizedDemo 
{
	public synchronized void thExample()
	{
		OneThread th1 = new OneThread();
		OneThread th2 = new OneThread();
		OneThread th3 = new OneThread();
		OneThread th4 = new OneThread();
		th1.setName("th1");
		th2.setName("th2");
		th3.setName("th3");
		th4.setName("th4");
		th1.start();
		
		th2.start();
		th3.start();
		th4.start();
	}
    public static void main(String[] args)
    {
    	new SynchronizedDemo().thExample();
    }
}
