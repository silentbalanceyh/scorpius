package com.sco.daily._20141124to1130;

import java.math.BigInteger;


public class BigIntegerAndBigDecimal {
	public static void main(String args[]){
		BigInteger bigValue1 = new BigInteger("100");
		BigInteger bigValue2 = new BigInteger("-50");		
		System.out.println("bigValue1:" + bigValue1 + "\nbigValue2:" + bigValue2);
		
		//绝对值
		System.out.println("abs:" + bigValue2.abs());
		//加法
		System.out.println("add:" + bigValue1.add(bigValue2));
		System.out.println("bigValue1:" + bigValue1 + "\nbigValue2:" + bigValue2);
		//与
		System.out.println("and:" + bigValue1.and(bigValue2));
		//andNot
		System.out.println("andNot:" + bigValue1.andNot(bigValue2));
		System.out.println("Not:" + bigValue2.not());
		//与符号位不同的位的常数
		System.out.println("bitCount:" + bigValue1.bitCount());
		System.out.println("bitCount:" + bigValue2.bitCount());
		//与符号无关的补码位数
		System.out.println("bitLength:" + bigValue1.bitLength());
		System.out.println("bitLength:" + bigValue2.bitLength());
		
		System.out.println("clearBit:" + bigValue1.clearBit(2));
		//比较
		System.out.println("compareTo:" + bigValue1.compareTo(bigValue2));
		
		//除法
		System.out.println("divide:" + bigValue1.divide(bigValue2));
		System.out.println("pow:" + Math.pow(2,3));
		System.out.println("pow:" + bigValue1.pow(2));
		
		
	}

}
