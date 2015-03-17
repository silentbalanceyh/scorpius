package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SwitchStr
 * @class com.sco._1st.SwitchStr
 * @date Dec 7, 2014 12:02:59 AM
 * @see
 */
public class SwitchStr {
	public static void main(String[] args) {
		String name = "b";
		int value = 0;
		switch (name) {
		case "a":
			value = 1;
			break;
		case "b":
			value = 2;
			break;
		case "c":
			value = 3;
			break;
		case "d":
			value = 4;
			break;
		case "e":
			value = 5;
			break;
		default:
			value = 6;
		}
		System.out.println(value);
	}
}
