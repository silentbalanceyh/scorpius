package com.sco.daily._201501;

public class TestPartClass {
	public static void main(String args[]){
		TestPartClass objTester = new TestPartClass();
		objTester.Test();
		
	}
	
	public void Test(){
		// Class没有任何修饰符
		class TestClass{
			int intValue = 1;
			public void printString(){
				System.out.println("part class test, the value is " + this.intValue);
			}
		}
		
		TestClass objTest = new TestClass();
		objTest.printString();
		
	}
}
