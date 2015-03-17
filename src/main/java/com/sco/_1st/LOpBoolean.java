package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class LOpBoolean {
	// ~ Static Methods ======================================
	
	public static void main(String args[]){
		int inputArg = Integer.parseInt(args[0]);
		if( 5 < inputArg && inputArg < 10){
			System.out.println("Between 5 and 10;");
		}else{
			System.out.println("Not in range.");
		}
		
		if( inputArg < 10 || inputArg > 20 ){
			System.out.println("Not between 10 and 20.");
		}else{
			System.out.println("Out of scope.");
		}
		
		if(!(inputArg < 0)){
			System.out.println("OK to compare.");
		}else{
			System.out.println("Not OK.");
		}
	}
}
