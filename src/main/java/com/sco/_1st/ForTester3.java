package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ForTester3
 * @class com.sco._1st.ForTester3
 * @date Dec 10, 2014 1:25:51 PM
 * @see
 */
public class ForTester3 {

	public static void main(String args[]){
		for( int count = 0; count < 10; count++ ){
			System.out.println("\t" + count);
			// 修改循环变量
			count *= 2;
		}
		System.out.println("\t循环结束！");
		
		int i = 0;
		for(; i < 10; ){
			System.out.println("\t" + i);
			// 修改循环变量
			i++;
		}
		System.out.println("\t循环结束！");
		// 还可以使用i
	}
}
