package com.sco._2nd.oo.classes.constructor;

public class Constructors {
	public Constructors(){
		System.out.println("In the constructor");
	}
	
	public Constructors(int value){
		if( value < 0 )
			throw new IllegalArgumentException("Constructors: value < 0");
	}
	/*
	public void Constructors(){
		System.out.println("In void Constructor()");
	}*/
	
	void method1(){
		for( int i = 0; i < 5; i++ ){
			System.out.println(i);
		}
	}
	
	public static void main(String[] a){
		Constructors l = new Constructors();
		l.method1();
		//l.Constructors();
		new Constructors(-1);
	}
}
