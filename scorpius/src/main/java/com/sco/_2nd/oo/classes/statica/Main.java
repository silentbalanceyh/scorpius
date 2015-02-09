package com.sco._2nd.oo.classes.statica;

public class Main {
	public static void main(String args[]){
		Counter object1 = new Counter();
		System.out.println(object1.getNumberOfObjects());
		
		Counter object2 = new Counter();
		System.out.println(object2.getNumberOfObjects());
	}
}

class Counter{
	static int counter = 0;
	public Counter(){
		counter++;
	}
	
	public int getNumberOfObjects(){
		return counter;
	}
}
