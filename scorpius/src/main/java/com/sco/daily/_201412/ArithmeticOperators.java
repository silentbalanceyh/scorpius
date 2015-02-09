package com.sco.daily._201412;

public class ArithmeticOperators {
	public static void main(String args[]){
		System.out.println("------------ * -------------");
		float fA = 12.12f;
		int iA = 3;
		System.out.println(fA * iA);
		System.out.println(fA * 0.0);
		System.out.println(fA * 0);
		
		System.out.println("------------ / -------------");
		System.out.println(fA / iA);
		System.out.println(fA / 0.0);
		System.out.println(fA / 0);
		
		System.out.println("------------ % -------------");
		System.out.println(fA % iA);
		System.out.println(fA % 0.0);
		System.out.println(fA % 0);
	//	System.out.println(iA % 0);
		
		System.out.println("------------ + -------------");
		System.out.println(fA + iA);
		System.out.println("+ = " + fA + iA);
		
		System.out.println("------------ - -------------");
		System.out.println(fA - iA);
		
		System.out.println("------------ 移位 -------------");
		System.out.println(~iA + " << " + (~iA << 3) );
		System.out.println(iA + " << " + (iA << 3) );
		System.out.println(~iA + " >> " + (~iA >> 3) );
		System.out.println(iA + " >> " + (iA >> 3) );
		System.out.println(~iA + " >>> " + (~iA >>> 3) );
		
		System.out.println("iA >> 32 : " + (iA >> 32) );
	//	System.out.println("fA >> 32 : " + (fA >> 32) );
		System.out.println("iA << 32 : " + (iA << 32) );
		System.out.println("1 << 31 >> 31 : " + (1 << 31 >> 31 )); //O_O 
		
		System.out.println("2^5 : " + Pow2(5));
	}
	
	public static long Pow2(int n){
		
		return (2 << (n-1));
	}

}
