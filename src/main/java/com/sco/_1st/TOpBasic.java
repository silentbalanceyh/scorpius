package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class TOpBasic {
	// ~ Static Methods ======================================
	
	public static void main(String args[]){
		int a = args.length == 1 ? Integer.parseInt(args[0]) : 0;
		System.out.println(a);
		
		// boolean b = (a > 0) ? {55 > 6}: {97 < 100}; // Compile Error
		boolean c = (a > 0) ? (55 > 6): (97 < 100);
		System.out.println(c);
	}
	
	public static void printWithTOp(String a){
		int b = a == null ? 0: Integer.parseInt(a);
		System.out.println(b);
	}
	
	public static void printWithoutTOp(String a){
		int b = 0;
		if( a != null ){
			b = Integer.parseInt(a);
		}
		System.out.println(b);
	}
}
