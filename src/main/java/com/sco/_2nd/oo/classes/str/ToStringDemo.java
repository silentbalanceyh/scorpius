package com.sco._2nd.oo.classes.str;

public class ToStringDemo {
	public static void main(String args[]){
		double d = 858.48;
		String string = Double.toString(d);
		
		int dot = string.indexOf(".");
		System.out.println(string.substring(0,dot).length() + " digits before decimal point.");
		System.out.println(string.substring(dot+1).length() + " digits after decimal point.");
	}
}
