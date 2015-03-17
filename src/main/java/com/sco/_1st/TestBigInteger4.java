package com.sco._1st;

import java.math.BigDecimal;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name TestBigInteger4
 * @class com.sco._1st.TestBigInteger4
 * @date Dec 2, 2014 7:24:38 PM
 * @see
 */
public class TestBigInteger4 {
	public static void main(String[] args){
		System.out.println(new BigDecimal(123456789.01).toString());
        System.out.println(new BigDecimal("123456789.01").toString());
	}
}
