package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name BreakCase1
 * @class com.sco._1st.BreakCase1
 * @date Dec 11, 2014 2:46:34 PM
 * @see
 */
public class BreakCase1 {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("\ti的值是" + i + ",j的值是" + j);
				if (j == 2) {
					break;
				}
			}
		}
	}
}
