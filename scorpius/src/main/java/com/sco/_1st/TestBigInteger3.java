package com.sco._1st;

import java.math.BigInteger;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name TestBigInteger3
 * @class com.sco._1st.TestBigInteger3
 * @date Dec 2, 2014 5:41:26 PM
 * @see
 */
public class TestBigInteger3 {
	public static void main(String args[]){
		BigInteger a1 = BigInteger.valueOf(97);
		BigInteger a2 = new BigInteger("15");
		System.out.println(a1.modInverse(a2));
		System.out.println(a1.modPow(a1, a2));
		System.out.println(calculate(40));
	}
	
	public static BigInteger calculate(long limit){
		BigInteger bInt = BigInteger.valueOf(0);
		if(limit <= 2){
			bInt = bInt.add(BigInteger.valueOf(1));
		}else{
			bInt = calculate(limit - 1).add(calculate(limit - 2));
		}
		return bInt;
	}
}
