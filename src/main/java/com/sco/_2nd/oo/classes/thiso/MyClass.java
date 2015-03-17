package com.sco._2nd.oo.classes.thiso;


public class MyClass {
	final static int MAXX=640, MAXY=480;
	int x,y;
	
	MyClass(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	MyClass(){
		this(MAXX/2, MAXY/2);
	}
	
	public String toString(){
		return "[" + x + "," + y + "]";
	}
	
	public static void main(String args[]){
		System.out.println(new MyClass(300,100));
		System.out.println(new MyClass());
	}

}
