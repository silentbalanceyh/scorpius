package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name NestedFor
 * @class com.sco._1st.NestedFor
 * @date Dec 10, 2014 1:49:23 PM
 * @see
 */
public class NestedFor {
	public static void main(String args[]){
		for( int i = 0; i < 3; i++ ){
			for( int j = 0; j < 4; j++ ){
				System.out.println("\ti的值为：" + i + ",j的值为：" + j);
			}
		}
	}
}
