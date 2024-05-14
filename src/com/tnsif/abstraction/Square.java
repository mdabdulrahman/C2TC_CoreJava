package com.tnsif.abstraction;



public class Square extends Shape {

	float side;
	Square(float side)
	{
		this.side = side;
	}
	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area = side * side;
	}

}
