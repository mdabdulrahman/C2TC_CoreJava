package com.tnsif.c2tc.collections;
import java.util.*;
public class LinkedListDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
        ll.add("hi");
        ll.add("d");
        ll.add("hi");
     
        System.out.println(ll);
      
        
        for( Object ele : ll )
        	System.out.println(ele);
        
        
        ListIterator li = ll.listIterator();
        System.out.println(li.next());
        System.out.println(li.hasNext());
        System.out.println(li.next());
        li.set("j");
      //  Collections.sort(ll);
        
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
        
	}

}
