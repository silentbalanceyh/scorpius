package com.sco.java2s.dt.box;
/**
 * 
 * @author Lang
 * @package com.sco.java2s.dt.box
 * @name AutoBox
 * @class com.sco.java2s.dt.box.AutoBox
 * @date Nov 26, 2014 9:11:41 PM
 * @see
 */
public class AutoBox {
	public static void main(String args[]){
		Integer iOb = 100; // autobox an int
		int i = iOb;	// auto-unbok
		System.out.println(i + " " + iOb); // display 100 100
	}
}
