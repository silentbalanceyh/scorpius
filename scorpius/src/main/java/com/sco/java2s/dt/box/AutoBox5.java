package com.sco.java2s.dt.box;
/**
 * 
 * @author Lang
 * @package com.sco.java2s.dt.box
 * @name AutoBox5
 * @class com.sco.java2s.dt.box.AutoBox5
 * @date Nov 26, 2014 9:18:26 PM
 * @see
 */
public class AutoBox5 {
	public static void main(String args[]){
		Boolean b = true;
		if(b)
			System.out.println("b is true");
		Character ch = 'x';
		char ch2 = ch;
		System.out.println("ch2 is " + ch2);
	}
}
