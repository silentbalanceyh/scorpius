package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name BreakCase2
 * @class com.sco._1st.BreakCase2
 * @date Dec 11, 2014 2:56:25 PM
 * @see
 */
public class BreakCase2 {
	public static void main(String args[]){
		// 内存循环，outer作为标识符
		outer: for (int i = 0; i < 3; i++) {
			// 内存循环
			for( int j = 0; j < 4; j++ ){
				System.out.println("\ti的值是" + i + ",j的值是" + j);
				if( j == 2){
					// 跳出外层循环
					break outer;
				}
			}
		}
	}
}
