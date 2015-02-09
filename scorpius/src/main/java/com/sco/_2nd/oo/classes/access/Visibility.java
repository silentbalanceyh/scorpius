package com.sco._2nd.oo.classes.access;

public class Visibility {
	final int i = 42;
	void method1(){
		for( int i = 0; i < 10; i++)
			System.out.println(" i = " + i);
		System.out.println("i = " + i);
	}
	
	public static void main(String args[]){
		Visibility visibility = new Visibility();
		visibility.method1();
	}
}
