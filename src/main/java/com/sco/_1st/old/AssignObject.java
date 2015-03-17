package com.sco._1st.old;

public class AssignObject {
	public static void main(String args[]){
		// Primitives类型
		System.out.println("--------------------");
		int bNumber = 1;
		int aNumber = bNumber;
		
		System.out.println("Before assign aNumber is " + aNumber);
		System.out.println("Before assign bNumber is " + bNumber);
		
		aNumber = 12;
		
		System.out.println("After assign aNumber is " +aNumber);
		System.out.println("After assign bNumber is " + bNumber);
		// Reference类型
		System.out.println("--------------------");
		StringBuffer bBuffer = new StringBuffer("b");
		StringBuffer aBuffer = bBuffer;
		
		System.out.println("Before assign aBuffer is " + aBuffer);
		System.out.println("Before assgin bBuffer is " + bBuffer);
		
		aBuffer.append(" assign a");
		
		System.out.println("Before assign aBuffer is " + aBuffer);
		System.out.println("Before assgin bBuffer is " + bBuffer);
	}
}
