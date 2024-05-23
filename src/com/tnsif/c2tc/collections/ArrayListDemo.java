package com.tnsif.c2tc.collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		 ArrayList list = new ArrayList();
		 System.out.println("Size : "+list.size());
		 System.out.println("Is list empty ? "+list.isEmpty());
		 list.add(1);
		 list.add("hi");
		 list.add(new ArrayListDemo());
		 list.add(list);
		 List n =(List) list.getLast();
		 n.add(4);
		
		 System.out.println(list);
		 

	}

}
