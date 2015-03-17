package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpComplexBit
 * @class com.sco._1st.OpComplexBit
 * @date Dec 17, 2014 8:27:46 PM
 * @see
 */
public class OpComplexBit {
	public static void main(String args[]) {
		// 1.++基本用法再探
		int n = 3;
		System.out.println(n == (n++));
		System.out.println(!(n == (++n)));
		// 2.复杂的++表达式
		int i = 4;
		int j = 6;
		int result = i++ + ++j + i++ + ++i + i + ++i;
		System.out.println("result:" + result);
		// 3.复杂的++表达式
		int a = 5;
		int result1 = a++ + a++ + a++ + a++;
		System.out.println("result1:" + result1);
	}
}
