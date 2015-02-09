package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SwitchDefault
 * @class com.sco._1st.SwitchDefault
 * @date Dec 7, 2014 12:15:11 AM
 * @see
 */
public class SwitchDefault {
	public static void main(String args[]){
		String name = "b";
		int value = 0;
		switch (name) {
		default:
			value = 6;
			break;
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
		}
		System.out.println(value);
	}
}
