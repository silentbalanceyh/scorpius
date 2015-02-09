package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name LabelTester
 * @class com.sco._1st.LabelTester
 * @date Dec 11, 2014 3:36:41 PM
 * @see
 */
public class LabelTester {
	public static void main(String args[]) {
		int i = 0;
		outer: while (i < 5) {
			int j = 6;
			i++;
			do {
				System.out.println("\ti的值是" + i + ",j的值是" + j);
				if (j == 3) {
					continue outer;
				}
				j--;
			} while (j > 0);
		}
	}
}
