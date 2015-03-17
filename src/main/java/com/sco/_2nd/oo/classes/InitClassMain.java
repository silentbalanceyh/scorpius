package com.sco._2nd.oo.classes;

public class InitClassMain {
	public static void main(String args[]){
	}
}


class P{
	public static int number = 1;
	
	public P(int x){
		System.out.println("P Constructors");
		instance = x;
	}
	
	public int instance = 3;
}

class Sub extends P{
	static{
		number = 3;
	}
	public static int number;
	
	public int instance = 3;
	
	public Sub(){
		super(3);
		System.out.println("Sub constructors");
	}
	
	public void run(){
		System.out.println(super.instance);
	}
}

class Singlton{
	
	public String pointer1;
	
	 Singlton(String name){
		
	}
}