package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name WhileCase1
 * @class com.sco._1st.WhileCase1
 * @date Dec 10, 2014 11:48:36 AM
 * @see
 */
public class WhileCase1 {
	public static void main(String args[]){
		// 循环的初始化条件
		int count = 0;
		// 当count小于10的时候执行循环体
		while(count < 10){
			System.out.println("\t" + count);
			// 迭代语句
			count++;
		}
		System.out.println("\t循环结束！");
	}
}
