package com.sco._2nd.oo.classes.statica;

class Cup{
	Cup(int market){
		System.out.println("Cup(" + market + ")");
	}
	
	void f(int market){
		System.out.println("f(" + market + ")");
	}
}

class Cups{
	static Cup c1;
	static Cup c2;
	
	static{
		c1 = new Cup(1);
		c2 = new Cup(2);
	}
	
	Cups(){
		System.out.println("Cups()");
	}
}

public class ExplicitStatic {
	public static void main(String args[]){
		System.out.println("Inside main()");
		Cups.c1.f(99);
	}
}
