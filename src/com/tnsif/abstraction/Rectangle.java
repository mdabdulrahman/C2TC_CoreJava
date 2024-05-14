package com.tnsif.abstraction;

public class Rectangle extends Shape {
    float l,w;
	Rectangle(float l,float w)
	{
		this.l  =l;
		this.w = w;
	}
	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area = l * w;
	}

}
