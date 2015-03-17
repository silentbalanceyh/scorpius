package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpAddSubstract
 * @class com.sco._1st.OpAddSubstract
 * @date Dec 18, 2014 2:47:01 PM
 * @see
 */
public class OpAddSubstract {
	public static void main(String args[]){
		// 1.加法、减法常规用法
		double a = 5.2;
		double b = 3.1;
		double c = a + b;
		double d = a - b;
		System.out.println("\tc的值是：" + c);
		System.out.println("\td的值是：" + d);
		// 2.加法特殊用法：字符串连接
		String left = "Hello ";
		String right = "Add operator";
		String result = left + right;
		System.out.println("\tresult的值是：" + result);
	}
}
