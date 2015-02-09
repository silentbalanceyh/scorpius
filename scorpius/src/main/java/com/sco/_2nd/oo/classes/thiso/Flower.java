package com.sco._2nd.oo.classes.thiso;

public class Flower {
	int petalCount = 0;
	
	String string = new String("null");
	
	Flower(int petals){
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount=" + petalCount);
	}
	
	Flower(String ss) {
		System.out.println("Constructor w/ String arg only, s=" + ss);
		this.string = ss;
	}
	
	Flower(String s,int petals) {
		this(petals);
		this.string = s;
		System.out.println("String & int args");
	}
	
	Flower() {
		this("hi",47);
		System.out.println("default constructor (no args");
	}
	
	void print(){
		System.out.println("petalCount = " + petalCount + " s = " + string);
	}
	
	public static void main(String args[]){
		Flower x = new Flower();
		x.print();
	}
}
