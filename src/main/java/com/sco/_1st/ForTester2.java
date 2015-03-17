package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ForTester2
 * @class com.sco._1st.ForTester2
 * @date Dec 10, 2014 1:22:17 PM
 * @see
 */
public class ForTester2 {
	public static void main(String args[]) {
		for (int b = 0, s = 0, p = 0; b < 10 && s < 4 && p < 10; p++) {
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}
}
