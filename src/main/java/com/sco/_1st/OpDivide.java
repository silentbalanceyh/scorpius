package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpDivide
 * @class com.sco._1st.OpDivide
 * @date Dec 18, 2014 12:08:52 PM
 * @see
 */
public class OpDivide {
	public static void main(String args[]){
		double a = 5.2;
		double b = 3.1;
		double c = a / b;
		// div的值是一个无限小数
		System.out.println("\t除法结果是：" + c);
		// 输出是正无穷大：Infinity
		System.out.println("\t5除以0.0的值是：" + 5/0.0);
		// 输出是负无穷大：-Infinity
		System.out.println("\t-5除以0.0的值是：" + -5/0.0);
		// 下边的代码将会抛异常
		// java.lang.ArithmeticException: / by zero
		System.out.println("\t-5除以0的值是：" + -5/0);
	}
}
