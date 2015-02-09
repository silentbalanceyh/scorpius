package com.sco.daily._201412;

public class IfElsePrimeNumber {
	public static void main(String args[]){
		boolean booleanFlag;
		
		for(int i = 1; i < 100; i++){
			booleanFlag = primeNumber(i);
			if(booleanFlag == true){
				System.out.print(i + "  ");
			}
		}
		
	}
	
	public static boolean primeNumber(int iNumber){
		boolean flag;
		flag = true;
	
		for(int i = 2; i <= Math.sqrt(iNumber); i++){
			if(iNumber % i == 0){
				flag = false;
				break;		
			}
		}
		return flag;
	}

}
