package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name WrapperJDK15Tester
 * @class com.sco._1st.WrapperJDK15Tester
 * @date Dec 6, 2014 9:36:24 PM
 * @see
 */
public class WrapperJDK15Tester {
	public static void main(String args[]){
		Integer a = new Integer(12);
		Integer b = a;
		
		int c = 12;
		Integer d = c;
		System.out.println(b);
		System.out.println(d);
		
		print(c);
		
		Integer e = new Integer(13);
		Integer f = new Integer(12);
		Integer g = e + f;
		System.out.println(g);
	}
	
	public static void print(Integer a){
		System.out.println(a);
	}
}
