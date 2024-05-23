package com.tnsif.c2tc.collections;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<Integer> animals = new Vector<>();
        for( int i = 1; i < 11; i++ )
        	animals.add(i);
        System.out.println(animals);
        animals.remove(3);
        System.out.println(animals);
        animals.addAll(animals);
        System.out.println(animals);
        animals.add(3);
        animals.add(3);;
        animals.add(3);
        animals.add(3);;
        System.out.println(animals.capacity());
        for( Integer num : animals)
        	System.out.println(num);
        
	}

}
