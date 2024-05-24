package com.tnsif.c2tc.lambdaexpression;

public class LambdaExpWithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Statement st = () -> "Hello World!";
        
        System.out.println(st.show());
	}

}
