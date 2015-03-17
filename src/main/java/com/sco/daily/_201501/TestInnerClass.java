package com.sco.daily._201501;

public class TestInnerClass {
	public static void main(String args[]){
		//第一种定义方法
		TestInnerClass.InnerClass objInnerClass1 = new TestInnerClass().new InnerClass();
		//第二种定义方法
		TestInnerClass objOuterClass = new TestInnerClass();
		TestInnerClass.InnerClass objInnerClass2 = objOuterClass.new InnerClass();
		
		objInnerClass1.printString();
		objInnerClass2.printString();
	}
	protected class InnerClass{
		public void printString(){
			System.out.println("InnerClass");
		}
	}
}
