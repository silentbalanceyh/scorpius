package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class LOpBit {
	// ~ Static Methods ======================================
	
	public static void main(String args[]){
		int inputArg = Integer.parseInt(args[0]);
		boolean result = inputArg > 3 & inputArg < 10;
		System.out.println(result);
		if( 3 < inputArg & inputArg < 100){
			System.out.println("Between 3 and 100. ( Exclued )");
		}else{
			System.out.println("Not in range.");
		}
	}
}
