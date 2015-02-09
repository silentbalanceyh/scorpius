package com.sco._2nd.oo.classes.str;

public class ToString {
	int value;
	ToString() {
		value = 0;
	}
	
	ToString(int it){
		value = it;
	}
	
	public String toString(){
		return "-->" + value + "<--";
	}
	
	public static void main(String args[]){
		ToString string = new ToString(123);
		System.out.println("Hello, World of Java");
		System.out.println("My object is "  + string);
	}
}
