package com.sco._1st;

import java.util.Arrays;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ArrayForEach
 * @class com.sco._1st.ArrayForEach
 * @date Dec 3, 2014 12:47:43 AM
 * @see
 */
public class ArrayForEach {
	public static void main(String args[]) {
		String[] arrayStrings = new String[3];
		for (int i = 0; i < arrayStrings.length; i++) {
			arrayStrings[i] = new String("String" + i);
		}
		System.out.println(Arrays.asList(arrayStrings));
	}
}
