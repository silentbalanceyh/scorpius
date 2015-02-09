package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name DoWhileCase1
 * @class com.sco._1st.DoWhileCase1
 * @date Dec 10, 2014 12:08:19 PM
 * @see
 */
public class DoWhileCase1 {
	public static void main(String args[]){
		// 定义循环变量
		int count = 0;
		// 执行do while循环
		do{
			// 循环迭代语句
			count++;
			
			System.out.println("\t" + count);
		}while(count < 10);
		System.out.println("\t循环结束！");
	}
}
