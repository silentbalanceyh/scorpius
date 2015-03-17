package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class ROpEqual {
	// ~ Static Methods ======================================
	@SuppressWarnings("unused")
	public static void main(String args[]){
		final Integer a = Integer.valueOf(3);
		final int b = 3;
		System.out.println(a == b);
		
		final boolean t = true;
		final int c = 1;
		// System.out.println(t == c);		// Compile Error
		
		final boolean f = false;
		System.out.println(t == f);
		System.out.println(t != f);
		
		final String str = "Hello";
		// System.out.println(str == c);    // Compile Error
	}
}
