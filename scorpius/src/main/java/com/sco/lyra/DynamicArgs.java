package com.sco.lyra;

public class DynamicArgs {
	
	public static void main(String args[]){
		printArgs();
		printArgs("Test");
	}
	
	private static void printArgs(final String... args){
		System.out.println(args.length);
		System.out.println(args);
	}
}
