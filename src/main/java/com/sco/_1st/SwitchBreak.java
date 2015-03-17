package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SwitchBreak
 * @class com.sco._1st.SwitchBreak
 * @date Dec 7, 2014 12:23:19 AM
 * @see
 */
public class SwitchBreak {

	public static void main(String[] args) {
		String name = "b";
		int value = 0;
		switch (name) {
		case "a":
			value = 1;
			break;
		case "b":
			value = 2;
		case "c":
			value = 3;
		default:
			value = 6;
			break;
		case "d":
			value = 4;
			break;
		case "e":
			value = 5;
			break;
		}
		System.out.println(value);
	}

}
