package com.tnsif.c2tc.collections;

import java.util.*;

public class ArrayListDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List list = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements in ArrayList : ");
        int n = in.nextInt();
        for( int i = 0; i < n;i++)
        	list.add(in.nextInt());
        System.out.println(list);
		
	}

}
