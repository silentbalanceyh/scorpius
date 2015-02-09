package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpBitMoving
 * @class com.sco._1st.OpBitMoving
 * @date Dec 18, 2014 3:59:42 PM
 * @see
 */
public class OpBitMoving {
	public static void main(String args[]){
		int a = -5;
		int b = 456;
		System.out.println(a << 32);
		System.out.println(a >> 32);
		System.out.println(a >>> 32);
		System.out.println(b << 32);
		System.out.println(b >> 32);
		System.out.println(b >>> 32);
	}
}
