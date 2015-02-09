package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ContinueCase
 * @class com.sco._1st.ContinueCase
 * @date Dec 11, 2014 3:16:58 PM
 * @see
 */
public class ContinueCase {
	public static void main(String args[]){
		// 一个简单的for循环
		for( int i = 0; i < 10; i++ ){
			if( i == 7 ){
				continue;
			}
			System.out.println("\ti的值是" + i);
		}
	}
}
