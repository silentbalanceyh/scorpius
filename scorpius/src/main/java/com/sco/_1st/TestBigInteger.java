package com.sco._1st;

import java.math.BigInteger;
import java.util.Random;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name TestBigInteger
 * @class com.sco._1st.TestBigInteger
 * @date Dec 2, 2014 5:19:15 PM
 * @see
 */
public class TestBigInteger {
	public static void main(String args[]){
		 System.out.println("-------------------构造BigInteger---------------------"); 
         //通过byte数组来创建BigInteger 
         BigInteger bi1 = new BigInteger(new byte[]{1, 1}); 
         System.out.println("bi1=" + bi1.toString()); 
         //创建带符号的BigInteger 
         BigInteger bi2 = new BigInteger(-1, new byte[]{1, 1}); 
         System.out.println("bi2=" + bi2.toString()); 
         //创建带符号的BigInteger随机数 
         BigInteger bi3 = new BigInteger(128, 20, new Random()); 
         System.out.println("bi3=" + bi3.toString()); 
         //通过10进制字符串创建带符号的BigInteger 
         BigInteger bi4 = new BigInteger("12342342342342123423423412341"); 
         System.out.println("bi4=" + bi4.toString()); 
         //通过10进制字符串创建带符号的BigInteger 
         BigInteger bi5 = new BigInteger("88888888888888888888888888888", Character.digit('a', 33)); 
         System.out.println("bi5=" + bi5.toString()); 
         System.out.println("BigInteger的常量："); 
         System.out.println("BigIntegerCase.ZERO=" + BigInteger.ZERO); 
         System.out.println("BigIntegerCase.ONE=" + BigInteger.ONE); 
         System.out.println("BigIntegerCase.TEN=" + BigInteger.TEN); 

         System.out.println("-------------------使用BigInteger---------------------"); 
         System.out.println("bi1的相反数=" + bi1.negate()); 
         System.out.println("bi1的相反数=" + bi1.negate()); 
         System.out.println("bi1+bi2=" + bi1.add(bi2)); 
         System.out.println("bi1-bi2=" + bi1.subtract(bi2)); 
         System.out.println("bi1*bi2=" + bi1.multiply(bi2)); 
         System.out.println("bi1/bi2=" + bi1.divide(bi2)); 
         System.out.println("bi1的10次方=" + bi1.pow(10)); 
         System.out.println("bi1的1次方=" + bi1.pow(1)); 
         BigInteger[] bx = bi4.divideAndRemainder(bi1); 
         System.out.println(">>>:bx[0]=" + bx[0] + ",bx[1]=" + bx[1]); 
         System.out.println("bi2的绝对值=" + bi2.abs()); 
	}
}
