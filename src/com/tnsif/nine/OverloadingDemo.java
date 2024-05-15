package com.tnsif.nine;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = MethodOverloading.add("Hi","Hello");
       float fl = MethodOverloading.add(4.8f, 5.9f);
       double dl = MethodOverloading.add(4.44, 9.99);
       int num = MethodOverloading.add(2,3);
       System.out.println("String : "+str);
       System.out.println("Float : "+fl);
       System.out.println("Double : "+dl);
       System.out.println("Integer : "+num);

       
	}
	

}
