package com.sco.daily._201412;

import java.util.Random;

public class SelectStatement {
	public enum enumA{a, b, c};
	public static void main(String args[], enumA a){
		
		System.out.println("------------ if -------------");
		int iA = 2;
		int iB = 3;
//		if(iA){
//			System.out.println("if - 1");
//		}
		if(iA > iB){
			System.out.println("if - 2 : iA > iB");
		}
		
		System.out.println("------------ if-Else -------------");
		if(iA > iB){
			System.out.println("if - 2 : iA > iB");
		}else if(iA < iB){
			System.out.println("if - 2 : iA < iB");
		}
		
		System.out.println("------------ Switch-number -------------");
		Random randomC = new Random();
		int iC = randomC.nextInt(3)+1;
	//	char ic = '1';
		switch(iC){
		case 1:
			System.out.println("Switch - First");
			break;
		case 2:
			System.out.println("Switch - Second");
		//	break;
		case 3:
			System.out.println("Switch - Third");
			break;
		default:
			System.out.println("Switch - Othet");			
		}
		
		System.out.println("------------ Switch-enum -------------");
		enumA chr = enumA.a;
		switch(chr){
		case a:
			System.out.println("enumA - a");
			
			break;
		case b:
			System.out.println("enumA - b");
			break;
		case c:
			System.out.println("enumA - c");
			break;
		default:
			System.out.println("enumA - Othet");	
			break;
		}
		
		 
		
		 
	}

}
