package com.sco._2nd.oo.classes.statica;

public class MainMethod {
	public static void main(String args[]){
		int result = add(1, 2);
		System.out.println("(1 + 2) is : " + result);
	}
	
	public static int add(int first, int second){
		return first + second;
	}
}
