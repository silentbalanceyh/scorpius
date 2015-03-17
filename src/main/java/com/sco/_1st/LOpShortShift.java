package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class LOpShortShift {
	// ~ Static Methods ======================================
	
	public static void main(String args[]){
		
		int a = 1;
		int b = 1;
		
		if( a < 0 && (++a) > 1){
			System.out.println("\tNonBit workflow!");
		}else{
			System.out.println("\tNot increased!");
		}
		
		if( b < 0 & (++b) > 1){
			System.out.println("\tBit workflow.");
		}else{
			System.out.println("\tFalse but increased!");
		}
		
		System.out.println("\ta = " + a);
		System.out.println("\tb = " + b);
	}
}
