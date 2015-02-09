package com.sco.daily._201412;

import java.math.BigInteger;

public class OperatorsBasic {
	
	public static void main(String args[]){
		
		/*
		 * 算术运算符
		 */
		
		int iValue1 = 1;
		int iValue2 = 2;
		int iValue3;
		double dValue1 = 3;
		double dValue2;
		double dValue3 = 2.1;
		
		dValue2 = iValue1 + dValue1;
		System.out.println("+ : " + dValue2);
		iValue1 = (int)(dValue2 - dValue1);
		System.out.println("- : " + iValue1);
		iValue3 = iValue1 * iValue2;
		System.out.println("* : " + iValue3);
		dValue2 = dValue1 / dValue3;
		System.out.println("/ : " + dValue2);
		System.out.println("1 / 0.0 : " + iValue1 /0.0);
		System.out.println("-2 / 0.0 : " + ~iValue1 /0.0);
		//为什么会报错呢
		//System.out.println("1 / 0 : " + iValue1 /0);
		iValue3 = iValue1 % iValue2;
		System.out.println("% : " + iValue3);
		System.out.println("iValue3++ : " + iValue3++);
		System.out.println("++iValue3 : " + ++iValue3);
		System.out.println("iValue3-- : " + iValue3--);
		System.out.println("--iValue3 : " + --iValue3);
		
		String strValue1 = "Hi ";
		String strValue2 = "Emma!";
		String strValue3 = strValue1 + strValue2;
		System.out.println("strValue1 + strValue2 : " + strValue3);
		
		/*
		 * 赋值运算
		 */
		iValue3 += 1;
		System.out.println("+= 1 : " + iValue3);
		iValue3 *= 3;
		System.out.println("*= 3 : " + iValue3);
		iValue3 -= 1;
		System.out.println("-= 1 : " + iValue3);
		iValue3 /= 2;
		System.out.println("/= 2 : " + iValue3);
		iValue3 %= 2;
		System.out.println("%= 2 : " + iValue3);
		
		iValue1 <<= 1;
		System.out.println("<<= 1 : " + iValue1);
	//	iValue1 = ~iValue1;
	//	System.out.println("~iValue1 : " + iValue1);
		iValue1 >>>= 1;
		System.out.println(">>>= 1 : " + iValue1);
		iValue1 &= 2;
		System.out.println("&= 2 : " + iValue1);
		iValue1 |= 2;
		System.out.println("|= 2 : " + iValue1);
		iValue1 ^= 1;
		System.out.println("^= 2 : " + iValue1);
		
		/*
		 * 比较运算符、位运算符
		 */
		for(int i = 0; i < 2; i++){
			if(iValue1 > iValue2){
				iValue2 = iValue2 << iValue1;
				System.out.println("<< : " + iValue2);
			}else{
				iValue2 = iValue1 >> 1;
				System.out.println(">> : " + iValue2);
			}
		}
		
		/*
		 * 逻辑运算符
		 */
		if(!(iValue1 > iValue2)){
			System.out.println("iValue1 < iValue2  ");
		}else{
			System.out.println("iValue1 > iValue2  ");
		}
		
		/*
		 * 成员调用， 三目运算
		 */
		OperatorsBasic opeA = new OperatorsBasic();
		System.out.println("?: : " + opeA.A( iValue1, iValue2));
		
		/*
		 * 嵌套
		 */
		System.out.println(BigInteger.valueOf(iValue1).doubleValue());
		
		/*
		 * 块语句
		 */
		//int iValue4 = 4;
		{
			int iValue4 = 5;
			System.out.println("iValue4 : " + iValue4);
		}
		
	//	System.out.println("iValue4 : " + iValue4);
		int iValue4 = 4;
		System.out.println("iValue4 : " + iValue4);
		
		/*
		 * 逗号
		 */
		int[] iArr = {1,2,3,4,5,6};
		for(int i = 0, j = 0; i < 3 && j < 2; i++){
			System.out.println("arr["+ i +"] : " + iArr[i]);
		}
	}
	
	public int A(int iValue1, int iValue2){
		return (iValue1 > iValue2) ? iValue1 : iValue2;
	}

}
