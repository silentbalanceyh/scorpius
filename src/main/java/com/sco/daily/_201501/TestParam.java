package com.sco.daily._201501;

public class TestParam {
	public static void main(String args[]){
		int intA = 10;
		int intB = 10;
		int intC = Add(intA, intB);
		
		System.out.println("intC = " + intC + " , int B = " + intB + " , intA = " + intA);
		
		StringBuilder strString = new StringBuilder("TestParam:");
		int intValue = Change(strString);
		System.out.println("strString = " + strString + " , intValue = " + intValue);
	}

	private static int Change(StringBuilder strString) {
		// TODO Auto-generated method stub
		int intLength = strString.length();
		strString = new StringBuilder("ChangeString");
		return intLength;
	}

	private static int Add(int intA, int intB) {
		// TODO Auto-generated method stub
		int intSum = intA + intB;
		intA = 20;
		intB = 30;
		return intSum;
	}

}
