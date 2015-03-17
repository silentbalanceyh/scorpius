package com.sco._1st.old;

import java.math.BigInteger;

public class BigIntTester {
	public static void main(String args[]){
		BigInteger leftInteger = new BigInteger("1234567890123400");
		BigInteger rightInteger = BigInteger.valueOf(123L);
		//大数加法
		BigInteger resultInteger = leftInteger.add(rightInteger);
		System.out.println("Add:" + resultInteger);
		//大数除法
		resultInteger = leftInteger.divide(rightInteger);
		System.out.println("Divide:" + resultInteger);
		//大数减法
		resultInteger = leftInteger.subtract(rightInteger);
		System.out.println("Substract:" + resultInteger);
		//大数乘法
		resultInteger = leftInteger.multiply(rightInteger);
		System.out.println("Multiply:" + resultInteger);
	}
}
