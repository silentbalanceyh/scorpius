package com.sco._1st.old;

public class ShortTruFalseTester {
	public static void main(String args[]){
		boolean a = true;
		boolean b = false;
		System.out.println(!a);
		System.out.println(a && b);
		System.out.println(a || b);
		
		int aNumber = 15;
		int bNumber = 5;
		System.out.println(aNumber & bNumber);
		System.out.println(aNumber | bNumber);
		System.out.println(aNumber ^ bNumber);
		System.out.println(~aNumber);
	}
}
