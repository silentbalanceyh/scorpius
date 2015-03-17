package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name NumberLiteral2
 * @class com.sco._1st.NumberLiteral2
 * @date Nov 27, 2014 9:48:01 PM
 * @see
 */
public class NumberLiteral2 {
	public static void main(String args[]){
		// 二进制
		int _2int = 0B10010010; // Since JDK 1.7
		// 八进制
		int _8int = 010763; 
		// 十六进制
		int _16int = 0xCAFE; 
		// 十进制
		int _10int = 92;
		System.out.println(_2int);
		System.out.println(_8int);
		System.out.println(_16int);
		System.out.println(_10int);
	}
}
