package com.sco._2nd.oo.work.copy;

public class ClassCast {
	public static void main(String args[]){
		CCA anA = new CCA();
		CCB aB = new CCB(1);
		CCC aC = new CCC(2, 3);
		
		System.out.println("A = " + anA);
		System.out.println("B = " + aB);
		System.out.println("C = " + aC);
		
		CCA aCast = aC;
		System.out.println("向上转型 ？ ： aCast = " + aCast);
		
		CCC anotherCCC = (CCC)aCast;
		System.out.println("anotherC = " + anotherCCC);
	}
}

class CCA{
	
}

class CCB extends CCA{
	int one;
	CCB(int i){
		one = i;
	}
	
	public String toString(){
		return "In a B object : " + one;
	}
}

class CCC extends CCB{
	CCC(int i, int j) {
		super(i);
		// TODO Auto-generated constructor stub
		two = j;
	}

	int two;
	
	public String toString(){
		return "In a C object : " + one + ", " + two;
	}
}


