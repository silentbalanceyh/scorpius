package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name NumberLiteral
 * @class com.sco._1st.NumberLiteral
 * @date Nov 26, 2014 4:40:10 PM
 * @see
 */
public class NumberLiteral {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		// 1.正常的赋值
		byte byteVal = 12; 
		short shortVal = 12;
		int intVal = 12;
		char charVal = 65;
		long longVal = 12;
		System.out.println(byteVal);
		System.out.println(shortVal);
		System.out.println(intVal);
		System.out.println(charVal);
		System.out.println(longVal);
		// 2.注释的为错误赋值，因为越界
		// intVal = 12L; // Incorrect
		intVal = (int) 12L;
		// byteVal = 128; // Incorrect
		// shortVal = 32768; // Incorrect
		byteVal = (byte)128;
		System.out.println(byteVal);
		// 3.相互赋值需要强制转换的情况
		intVal = shortVal;
		shortVal = (short)intVal;
		byteVal = (byte)longVal;
		// shortVal = intVal; // Incorrect
		// byteVal = longVal; // Incorrect
		// 4.自动提升
		byte a = 10;
		byte b = 20;
		// byte c = a * b;    // Incorrect
		int c = a * b;
		System.out.println(c);
		byte i = 50;
		// i = i * 2;		  // Incorrect
		i = 50 * 2;           
		i = (byte)(i * 2);
		System.out.println(i);
		// 5.浮点数
		// float floatVal = 0.4; // incorrect
		float floatVal = 0.5f;
		double doubleVal = 0.4;
		doubleVal = 0.8f;
		// floatVal = doubleVal; // incorrect
		System.out.println(floatVal);
		long retVal = (long)doubleVal;
		System.out.println(retVal);
		double doubleVal1 = longVal;
		System.out.println(doubleVal1);
	}
}
