package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class ROpGreater {
	public static void main(String args[]){
		// 直接比较
		int leftValue = 10;
		int rightValue = 12;
		System.out.println(leftValue < rightValue);
		
		short rightValue1 = 33;
		System.out.println(leftValue < rightValue1);
		
		byte rightValue2 = 31;
		System.out.println(leftValue > rightValue2);
		
		long rightValue3 = 5L;
		System.out.println(leftValue <= rightValue3);
		
		char rightValue4 = 'A';
		System.out.println(leftValue <= rightValue4);
		
		float rightValue5 = 8.1f;
		System.out.println(leftValue > rightValue5);
		
		double rightValue6 = 10.0;
		System.out.println(leftValue >= rightValue6);
	}
}