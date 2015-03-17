package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name BreakCase
 * @class com.sco._1st.BreakCase
 * @date Dec 11, 2014 2:29:59 PM
 * @see
 */
public class BreakCase {
	public static void main(String args[]){
		// 一个简单的for循环
		for( int i = 0; i < 10; i++ ){
			if( i == 7 ){
				break;
			}
			System.out.println("\ti的值是" + i);
		}
	}
}
