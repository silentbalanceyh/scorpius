package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name BasicType
 * @class com.sco._1st.BasicType
 * @date Nov 25, 2014 4:35:46 PM
 * @see
 */
public final class BasicTypeUtility {
	private BasicTypeUtility(){}

	public static void main(final String args[]){
		byte byteV = 1;
		byteV=2;
		short shortV = 2;
		int intV = 3;
		long longV = 4L;
		char charV1 = '\u0023';
		char charV2 = 'A';
		float floatV = 1.7f;
		double doubleV = 2.3;
		System.out.println(byteV);
		System.out.println(shortV);
		System.out.println(intV);
		System.out.println(longV);
		System.out.println(charV1);
		System.out.println(charV2);
		System.out.println(floatV);
		System.out.println(doubleV);
	}
}
