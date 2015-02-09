package com.sco._2nd.oo.work.copy;

public class Main {
	public static void main(String args[]){
		Outer.Inner inner1 = new Outer().new Inner();
		inner1.printString(1);
		
		Outer outer = new Outer();
		Outer.Inner inner2 = outer.new Inner();
		inner2.printString(2);
	}
}

class Outer{
	public class Inner{
		public void printString(int i){
			System.out.println("This is a inner class" + i);
		}
	}
}
