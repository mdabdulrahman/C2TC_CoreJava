package com.tnsif.c2tc.daytwo;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 10;
     int b =20;
     int x =10;
     System.out.println(a+b+"a and b value before the oeprations:");
     System.out.println("a and b value after the oeprations:"+a+b);
     ++a;
     int c = ++a+b;
     System.out.println("C value : "+c);
     x=(10==x)?1:0;
     System.out.println(x);
	}

}
