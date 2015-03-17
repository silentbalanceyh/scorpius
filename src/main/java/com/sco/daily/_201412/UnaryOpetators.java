package com.sco.daily._201412;

public class UnaryOpetators {
	public static void main(String args[]){
		int iA = 1;
		int iB = 2;
		int iC;
		
		iC = iA+++iB++;
		System.out.println("iA = " + iA);
		System.out.println("iB = " + iB);
		System.out.println("iC = " + iC);
	//	iC = iA+++++iB;
		iC = iA++ + ++iB;
		System.out.println("iA = " + iA);
		System.out.println("iB = " + iB);
		System.out.println("iC = " + iC);
		
		System.out.println("\n------------ ~ ----------------");
		System.out.println("iC = " + ~~iC++ + ~iC + " = " + iC);
		
		System.out.println("\n------------ ! ----------------");
		System.out.println(!!(iC > iA));
		
		System.out.println("\n------------ ++ ----------------");
		iC = iA++ + ++iA + iB++ + iB++ + iA + ++ iA;
		System.out.println("iA = " + iA);
		System.out.println("iB = " + iB);
		System.out.println("iC = " + iC);
		
		System.out.println("\n------------ -- ----------------");
		iC = --iA - iB-- + iA++-iB++;
		System.out.println("iA = " + iA);
		System.out.println("iB = " + iB);
		System.out.println("iC = " + iC);
		
		System.out.println("\n------------  ----------------");
		int a = 2;
		int b = 4;
		a += b += a += b += a;
		System.out.println("a = " + a + "\nb = " + b);
		
		
	}

}
