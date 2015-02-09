package com.sco.daily._201501;

public class TestEquals {
	public static void main(String args[]){
		int intA = 1;
		int intB = 1;
		
		Integer inteA = new Integer(1);
		Integer inteB = new Integer(1);
		
		System.out.println("intA == intB : " + (intA == intB));
	//	基本类型不存在equals方法	
	//	System.out.println("intA.equals(intB) : " + intA.equals(intB) );
		System.out.println("inteA == inteB : " + (inteA == inteB));
		System.out.println("inteA.equals(inteB) : " + inteA.equals(inteB) );
	}

}
