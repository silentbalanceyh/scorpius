package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ReturnCase
 * @class com.sco._1st.ReturnCase
 * @date Dec 11, 2014 4:06:02 PM
 * @see
 */
public class ReturnCase {
	public static void main(String args[]){
		// 一个简单的for循环；
		for( int i = 0; i < 3; i++ ){
			System.out.println("\ti的值是" + i);
			if( i == 1 ){
				return;
			}
			System.out.println("\tReturn 之后输出的语句。");
		}
	}
}
