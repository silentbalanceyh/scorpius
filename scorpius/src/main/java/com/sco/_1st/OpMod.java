package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpMod
 * @class com.sco._1st.OpMod
 * @date Dec 18, 2014 2:25:33 PM
 * @see
 */
public class OpMod {
	public static void main(String args[]){
		double a = 5.2;
		double b = 3.1;
		double c = a % b;
		System.out.println("\tc的值是：" + c);
		System.out.println("\t5对0.0取余的结果是：" + 5 % 0.0);
		System.out.println("\t-5.0对0取余的结果是：" + -5.0 % 0);
		System.out.println("\t0 对5.0求余的结果是：" + 0 % 5.0);
		System.out.println("\t0 对0.0求余的结果是：" + 0 % 0.0);
		// 下边代码将会抛出异常
		System.out.println("\t-5对0求余的结果是：" + -5 % 0);
	}
}
