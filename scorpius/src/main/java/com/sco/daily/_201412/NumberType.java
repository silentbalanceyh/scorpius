package com.sco.daily._201412;

import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.logging.Logger;

public class NumberType {
	public static void main(String args[]){
		
		/*
		 *  十进制 -> 二进制,八进制,十六进制
		 */
		int intValue = 10;
		String binValue, 
				octValue, 
				hexValue;
		binValue = Integer.toBinaryString(intValue);
		octValue = Integer.toOctalString(intValue);
		hexValue = Integer.toHexString(intValue);
	//	System.out.println("十进制 -> 二进制,八进制,十六进制：10");
		System.out.println("二进制：" + binValue);
		System.out.println("八进制：" + octValue);
		System.out.println("十六进制：" + hexValue);
		 Logger.getLogger("十六进制：" + hexValue);
		/*
		 * 二进制 -> 十进制，八进制，十六进制
		 */
		binValue = "00010000";
	//	String strTemp;
		intValue = Integer.valueOf(binValue, 2);
		octValue = Long.toOctalString(Long.parseLong(binValue, 2));
		hexValue = Long.toHexString(Long.parseLong(binValue,2));
		System.out.println("二进制 -> 十进制，八进制，十六进制：00010000");
		System.out.println("八进制：" + octValue);
		System.out.println("十进制：" + intValue);
		System.out.println("十六进制：" + hexValue);
	//	Integer.parseInt(s)  
	//	strTemp = String.format("%d",binValue);
	//	System.out.println(strTemp);
		
		/*
		 * 八进制 -> 二进制，十进制，十六进制
		 */
		octValue = "020";
		binValue = Long.toBinaryString(Long.parseLong(octValue,8));
	//	intValue = Integer.valueOf(octValue, 8);
		intValue = Integer.parseInt(octValue, 8);
		hexValue = Long.toHexString(Long.parseLong(octValue, 8));
		System.out.println("八进制 -> 二进制，十进制，十六进制： 0x10");
		System.out.println("二进制：" + binValue);
		System.out.println("十进制：" + intValue);
		System.out.println("十六进制：" + hexValue);
		
		/*
		 * 十六进制 -> 二进制，八进制, 十进制
		 */
	
		binValue = Long.toBinaryString(Long.parseLong(hexValue, 16));
		octValue = Long.toOctalString(Long.parseLong(hexValue, 16));
		intValue = Integer.parseInt(hexValue, 16);
		System.out.println("十六进制 -> 二进制，八进制, 十进制： ");
		System.out.println("二进制：" + binValue);
		System.out.println("八进制：" + octValue);
		System.out.println("十进制：" + intValue);
		

		/*
		 * 精度问题
		 */
		double dPrecision = 8.324;
		float fPrecision;
		fPrecision = (float) dPrecision;
		System.out.println("强制转换 d -> f:" + fPrecision);

		fPrecision = 8.324f;
		dPrecision = fPrecision;
		System.out.println("自动提升 f -> d:" + dPrecision);
		
		DecimalFormat formatPrecision = new DecimalFormat("00.0000");
		 
		dPrecision = Double.parseDouble(formatPrecision.format(fPrecision));
		System.out.println("DecimalFormat f -> d:" + dPrecision);
		BigDecimal bigDouble = new BigDecimal(String.valueOf(fPrecision));
		dPrecision = bigDouble.doubleValue();
		System.out.println("BigDecimal f -> d:" + dPrecision);
		
		int iJDK7 = 1_000_23__99;
		System.out.println("_语法：" + iJDK7);
		
		  
	}

}
