package com.sco.daily._201412;

public class Multiple3and7 {
	public static void main(String args[]){
		/*
		 * 20以内所有3的倍数
		 */
		System.out.println("\n-------------- 20以内所有3的倍数 ---------------");
		for(int i = 1; i < 20; i++){
			switch(i){
			case 3:
			case 6:
			case 9:
			case 12:
			case 15:
			case 18:
				System.out.println(i + " 是3的倍数");
				break;
			case 1:
			case 2:
			case 4:
			case 5:
			case 7:
			case 8:
			case 10:
			case 11:
			case 13:
			case 14:
			case 16:
			case 17:
			case 19:
				System.out.println(i + " 不是3的倍数");
				break;
			default:
				System.out.println("Other");
			}
		}
		/*
		 * 2000以内所有3跟7的倍数
		 */
		System.out.println("-------------- 2000以内所有3跟7的倍数 ---------------");
		for(int i = 1; i < 2000; i++){
			multiple(i);
		}
	}
	
	public static void multiple(int iNumber){		
		if(iNumber % 3 == 0 && iNumber % 7 == 0){
			System.out.println(iNumber + "	同时是3跟7的倍数");
		}else{
			if(iNumber % 3 == 0){
				System.out.println(iNumber + "	是3的倍数");
			}else if(iNumber % 7 == 0){
				System.out.println(iNumber + "	是7的倍数");
			}
		}		
	}

}
