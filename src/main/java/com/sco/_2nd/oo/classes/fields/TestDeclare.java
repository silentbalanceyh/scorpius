package com.sco._2nd.oo.classes.fields;

public class TestDeclare {
	public static void main(String args[]){
		String str = "blah";
		@SuppressWarnings("unused")
		int k;
		
		System.out.println(str);
		k = 2;
		for( int j = 0; j < 2; ++j ){
			System.out.println("j is " + j);
		}
	}
}
