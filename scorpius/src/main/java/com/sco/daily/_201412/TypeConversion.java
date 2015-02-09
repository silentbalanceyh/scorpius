package com.sco.daily._201412;

public class TypeConversion {

	@SuppressWarnings("unused")
	public static void main(String[] args){
		/*
		 * 整数类型
		 */
		byte bByte = 1;
		short sShort = 100;
		int iInt = 44;
		long lLong = 10L;
		System.out.println("整数类型");
		System.out.println("byte:	" + bByte);
		System.out.println("short:	" + sShort);
		System.out.println("int:	" + iInt);
		System.out.println("long:	" + lLong);
		
		/*
		 * 浮点类型
		 */
	//	float f_float = 10.0;
		float fFloat1 = 10;
		float fFloat2 = 13.27f;
		double dDouble = 13.0;
		System.out.println("浮点类型");
		System.out.println("float:	" + fFloat1 + "  &  " + fFloat2);
		System.out.println("double:	" + dDouble);
			
		/*
		 * 字符类型
		 */
	//	char c_char_1 ='AB';
		char cChar1 = 'A';
		char cChar2 = '\u0003';
		char cChar3 = '哈';
		System.out.println("字符类型");
		System.out.println("char:	" + cChar1 + "  &  " + cChar2 + "  &  " + cChar3);
		/*
		 * 布尔类型
		 */
	//	boolean bo_boolean_1 = 1;
		boolean boBooleanT = true;	
	//	boolean bo_boolean_0 = 0;
		boolean boBooleanF = false;	
		System.out.println("布尔类型");
		System.out.println("boolean:	" + boBooleanT + "  &  " + boBooleanF);
			
		/*
		 * 自动提升
		 */
		byte bA = 100;
		byte bB = 100;
		byte bC;
		int iC;
	//	bC = bA *bB;
		iC = bA * bB;
		System.out.println("自动提升,iC	" + iC);
			
		/*
		 * 强制转换
		 */
		byte bLift = 64;
		byte bRight = 2;
		short sProduct;
	//	sProduct = (short)bLift * (short)bRight;
	//	short = short * short 为什么不行呢
		sProduct = (short)((short)bLift * (short)bRight);
		System.out.println("short * short	" + sProduct);
		sProduct = (short)(bLift * bRight);
		System.out.println("byte to short	" + sProduct);
			
		int iProduct;
		iProduct = bLift * bRight;
		System.out.println("iProduct	" + iProduct);
			
		long lProduct;
		lProduct = bLift * bRight;
		System.out.println("lProduct	" + lProduct);
	//	iProduct = lProduct;
		iProduct = (int)lProduct;
		System.out.println("lProduct to iProduct	" + iProduct);
			
		float fObject = 13.242629f;
		lProduct = (long)fObject;
		System.out.println("float to long	" + lProduct);
		fObject = lProduct;
		System.out.println("fObject	" + lProduct);				
			
	}
}
