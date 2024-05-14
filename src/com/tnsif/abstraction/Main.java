package com.tnsif.abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape sq = new Square(5.4f);
       sq.calArea();
       sq.show();
       
       Shape rec = new Rectangle(4.89f,8.3f);
       rec.calArea();
       rec.show();
	}

}
