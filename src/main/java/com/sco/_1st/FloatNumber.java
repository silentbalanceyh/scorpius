package com.sco._1st;

import java.text.DecimalFormat;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name FloatNumber
 * @class com.sco._1st.FloatNumber
 * @date Nov 27, 2014 10:50:23 PM
 * @see
 */
public class FloatNumber {
	public static void main(String args[]) {
		// 浮点精度问题
		System.out.println(0.05 + 0.01);
		System.out.println(1.0 - 0.42);
		System.out.println(4.015 * 100);
		System.out.println(123.3 / 100);
		// 四舍五入问题
		System.out.println(4.015 * 100);
		// 浮点输出
		System.out.println(new DecimalFormat("0.00").format(4.025));
        System.out.println(new DecimalFormat("0.00").format(4.024));
        // 大于9999999.0的字体
        System.out.println(9969999999.04);
        System.out.println(199999999.04);
        System.out.println(1000000011.01);
        System.out.println(9999999.04);
	}
}
