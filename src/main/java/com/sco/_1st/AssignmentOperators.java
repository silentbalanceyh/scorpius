package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class AssignmentOperators {
	// ~ Static Methods ======================================
	
	public static void main(String args[]){
		// 定义一个Byte变量
		byte a = 5;
		// 下边语句出错，因为a默认是int类型，a + 5就是int
		// a = a + 5;
		byte b = 5;
		// 下边语句则不会出现错
		b += 5;
		System.out.println(a);
		System.out.println(b);
	}
}
