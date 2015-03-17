package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ContinueCase1
 * @class com.sco._1st.ContinueCase1
 * @date Dec 11, 2014 3:26:33 PM
 * @see
 */
public class ContinueCase1 {

	public static void main(String args[]) {
		outer: for (int i = 0; i < 5; i++) {
			// 内存循环
			for (int j = 0; j < 4; j++) {
				if (j == 1) {
					continue outer;
				}
				System.out.println("\ti的值为" + i + ",j的值为" + j);
			}
		}
	}
}
