package com.tnsif.c2tc.lambdaexpression;

public class LambdaExpWithParameter {

	public static void main(String[] args)
	{
	    Message mes = (name) -> System.out.println("Hello,"+name);
	    mes.greet("rahman");
        Addition sum = (a,b) -> a+b;
        System.out.println(sum.add(1,20));
	}

}
