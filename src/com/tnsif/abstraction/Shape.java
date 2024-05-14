package com.tnsif.abstraction;

public abstract class Shape {

	float area;
	abstract void calArea();
	void show()
	{  //getSimpleName() is used to get the class Name
		System.out.println("Area of "+this.getClass().getSimpleName()+" : "+area);
	}
	 
}
