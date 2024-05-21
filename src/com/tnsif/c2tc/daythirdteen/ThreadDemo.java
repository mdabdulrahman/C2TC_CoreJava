package com.tnsif.c2tc.daythirdteen;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		ThreadThree th3 = new ThreadThree();
		System.out.println("From main thread : "+th3.isAlive());
		th3.start();
		try
		{
			sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
