package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class LOpDiff {
	// ~ Static Methods ======================================
	
	@SuppressWarnings("unused")
	public static void main(String args[]){
		int a = 1;
		int b = 2;
		System.out.println( a & b );
		
		String a1 = "Hello";
		String a2 = "World";
		// System.out.println(a1 & a2); Compile Error
		
		short a3 = 1;
		short b3 = 2;
		System.out.println(a3 & b3 | b);
		
		long a4 = 1L;
		long b4 = 2L;
		System.out.println(a4 | b4 & a3);
		
		float f1 = 1.1f;
		float f2 = 1.3f;
		// System.out.println(f1 & f2); Commpile Error
		
		char c = 'a';
		char e = 'l';
		System.out.println( c & e);
		
		// System.out.println( 0.3 & 1.2 ); Compile Error
		System.out.println( true & false );
	}
}
