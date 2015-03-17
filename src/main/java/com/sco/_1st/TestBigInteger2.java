package com.sco._1st;

import java.math.BigInteger;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name TestBigInteger2
 * @class com.sco._1st.TestBigInteger2
 * @date Dec 2, 2014 5:24:15 PM
 * @see
 */
public class TestBigInteger2 {

	public static void main(String[] args) {
		BigInteger a1 = BigInteger.valueOf(1000L);
		BigInteger a2 = a1.add(BigInteger.valueOf(500));
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a2.mod(a1));
		System.out.println(a2.remainder(a1));
	}

}
