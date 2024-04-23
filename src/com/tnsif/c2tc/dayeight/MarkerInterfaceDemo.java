package com.tnsif.c2tc.dayeight;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student stu = new Student(01,"Rahman",2000,"IOT");
       if( stu instanceof Registrable)
       {
    	   System.out.println("Student is registered for the course");
           System.out.println(stu);
       }
       else
       {
    	   System.out.println("Student is not registered for this course");
       }
	}

}
