package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SwitchCase
 * @class com.sco._1st.SwitchCase
 * @date Dec 7, 2014 12:09:37 AM
 * @see
 */
public class SwitchCase {
	@SuppressWarnings("unused")
	public static void main(String args[]){
		String name = "b";
		final String z = "z";
		String y = "y";
		int value = 0;
		switch (name) {
		case "a":
		// case "a" + y: Incorrect
			value = 1;
			break;
		case "b" + "x":
			value = 2;
			break;
		case "c" + z:
			value = 3;
			break;
		case "d":
			value = 4;
			break;
		/* case "d":
			value = 6; Incorrect;
			break; */ 
		case "e":
			value = 5;
			break;
		default:
			value = 6;
		}
		System.out.println(value);
	}
}
