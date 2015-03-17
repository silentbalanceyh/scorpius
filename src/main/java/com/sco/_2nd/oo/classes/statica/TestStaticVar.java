package com.sco._2nd.oo.classes.statica;

class Box{
	double width;
	public static int numBoxes = 0;
	
	public Box(){
		width = 5.0;
		numBoxes++;
	}
}

public class TestStaticVar {
	public static  void main(String args[]){
		@SuppressWarnings("unused")
		Box box1 = new Box();
		@SuppressWarnings("unused")
		Box box2 = new Box();
		
		System.out.println("Number of objects " + Box.numBoxes);
	}
}
