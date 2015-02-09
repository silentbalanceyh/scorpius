package com.sco.daily._201501;

public class TestNotStaticClass {
	private int intValue = 1;
	
	protected class InnerClass{
		private int intValue = 10;
		
		public void printString(){
			System.out.println("InnerClass : " + this.intValue);
			System.out.println("InnerClass : " + TestNotStaticClass.InnerClass.this.intValue);
			System.out.println("TestNotStaticClass : "+ TestNotStaticClass.this.intValue);
		}
	}
	
	public static void main(String args[]){
		TestNotStaticClass objOuter = new TestNotStaticClass();
		InnerClass objInner = objOuter.new InnerClass();
		objInner.printString();
		
	}

}
