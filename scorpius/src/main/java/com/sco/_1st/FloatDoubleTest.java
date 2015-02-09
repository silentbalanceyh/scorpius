package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name FloatDoubleTest
 * @class com.sco._1st.FloatDoubleTest
 * @date Nov 25, 2014 4:39:43 PM
 * @see
 */
public class FloatDoubleTest {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		final float floatV = 1.8F / 1.1F;
		final double doubleV = 2.2D / 2.0;
		// IEEE
		printIEEE(floatV,doubleV);
		// Non-IEEE
		print(floatV,doubleV);
	}
	
	private static strictfp void printIEEE(final float floatV,final double doubleV){
		System.out.println(floatV);
		System.out.println(doubleV);
		System.out.println(0.05 + 0.01);
		System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);
	}
	
	private static void print(final float floatV,final double doubleV){
		System.out.println(floatV);
		System.out.println(doubleV);
		System.out.println(0.05 + 0.01);
		System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);
	}
}
