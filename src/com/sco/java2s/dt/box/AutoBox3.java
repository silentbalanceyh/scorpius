package com.sco.java2s.dt.box;
/**
 * 
 * @author Lang
 * @package com.sco.java2s.dt.box
 * @name AutoBox3
 * @class com.sco.java2s.dt.box.AutoBox3
 * @date Nov 26, 2014 9:14:55 PM
 * @see
 */
public class AutoBox3 {
	public static void main(String args[]){
		Integer iOb1, iOb2;
		int i;
		
		iOb1 = 100;
		System.out.println("Original value of iOb: " + iOb1);
		
		++iOb1;
		System.out.println("After ++iOb1: " + iOb1);
		
		iOb2 = iOb1 + (iOb1/3);
		System.out.println("iOb2 after expressions: " + iOb2);
		
		i = iOb1 + (iOb1/3);
		System.out.println("i after expression: " + i);
		
	}
}
