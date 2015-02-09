package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpBitNegation
 * @class com.sco._1st.OpBitNegation
 * @date Dec 17, 2014 10:01:01 AM
 * @see
 */
public class OpBitNegation {
	public static void main(String args[]){
		int number1 = 245;
		int number2 = -100;
		System.out.println("\t" + ~number1);
		System.out.println("\t" + ~number2);
		System.out.println("\t" + ~~~number1);
	}
}
