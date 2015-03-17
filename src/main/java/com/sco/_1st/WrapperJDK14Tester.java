package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name WrapperJDK14Tester
 * @class com.sco._1st.WrapperJDK14Tester
 * @date Dec 6, 2014 8:55:36 PM
 * @see
 */
public class WrapperJDK14Tester {
	public static void main(String args[]){
		/*Integer a = new Integer(12);
		int b = a;
		
		int c = 12;
		Integer d = c;*/
		Integer a = new Integer(12);
		int b = a.intValue();
		
		int c = 12;
		Integer d = Integer.valueOf(c);
		System.out.println(b);
		System.out.println(d);
		
		Integer e = new Integer(13);
		Integer f = new Integer(12);
		// Integer g = e + f;
		Integer g = Integer.valueOf(e.intValue() + f.intValue());
		System.out.println(g);
		
		// print(c);
	}
	
	public static void print(Integer a){
		System.out.println(a);
	}
}
