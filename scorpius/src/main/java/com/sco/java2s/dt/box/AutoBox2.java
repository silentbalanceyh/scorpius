package com.sco.java2s.dt.box;
/**
 * 
 * @author Lang
 * @package com.sco.java2s.dt.box
 * @name AutoBox2
 * @class com.sco.java2s.dt.box.AutoBox2
 * @date Nov 26, 2014 9:13:01 PM
 * @see
 */
public class AutoBox2 {
	// Take an integer parameter and return an int value;
	static int m(Integer v){
		return v;	// Auto-unboxk to int
	}
	
	public static void main(String args[]){
		// Pass an int to m() and assign the return value to an Integer. 
		// Here, the arguments 100 is autboxed into an Integer. The return value is also autoboxed into an Integer;
		Integer iObj = m(100);
		System.out.println(iObj);
	}
}
