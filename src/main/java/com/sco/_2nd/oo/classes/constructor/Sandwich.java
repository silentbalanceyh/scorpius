package com.sco._2nd.oo.classes.constructor;

class Meal{
	Meal(){
		System.out.println("Meal()");
	}
}

class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}

class Cheese{
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce{
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch{
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch{
	
	@SuppressWarnings("unused")
	private Bread bread = new Bread();
	
	@SuppressWarnings("unused")
	private Cheese cheese = new Cheese();
	
	@SuppressWarnings("unused")
	private Lettuce lettuce = new Lettuce();
	
	public Sandwich(){
		System.out.println("Sandwich()");
	}
	
	public static void main(String args[]){
		new Sandwich();
	}

}
