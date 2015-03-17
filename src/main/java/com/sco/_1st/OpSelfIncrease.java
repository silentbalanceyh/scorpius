package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpSelfIncrease
 * @class com.sco._1st.OpSelfIncrease
 * @date Dec 15, 2014 7:55:56 PM
 * @see
 */
public class OpSelfIncrease {
	@SuppressWarnings("unused")
	public static void main(String args[]){
		int a1 = 5;
		int b1 = a1++ + 6; // 运算符在操作数右边
		System.out.println("\tb1的值为：" + b1);
		System.out.println("\ta1的值为：" + a1);
		int a2 = 5;
		int b2 = ++a2 + 6; // 运算符在操作数左边
		System.out.println("\tb2的值为：" + b2);
		System.out.println("\ta2的值为：" + a2);
		
		int a3 = 7;
		// System.out.println(++a3++);
	}
}
