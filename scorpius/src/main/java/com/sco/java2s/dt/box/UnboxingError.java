package com.sco.java2s.dt.box;
/**
 * 
 * @author Lang
 * @package com.sco.java2s.dt.box
 * @name UnboxingError
 * @class com.sco.java2s.dt.box.UnboxingError
 * @date Nov 26, 2014 9:19:29 PM
 * @see
 */
public class UnboxingError {
	public static void main(String args[]){
		Integer iOb = 1000; // autobox the value 1000;
		int i = iOb.byteValue(); // 手工拆箱失败
		int i2 = iOb.intValue();
		System.out.println(i);
		System.out.println(i2);
	}
}
