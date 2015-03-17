package com.sco._2nd.oo.classes.abs;

public class AbstractStatic {
	
	public static void main(String args[]){
		System.out.println("Hello. The answer is yes.");
		
		AbstractStatic.foo();
	}
	
	public static void foo()
	{
		System.out.println("Hello from foo. The answer is still yes.");
	}
}
