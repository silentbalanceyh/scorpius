package com.sco.daily._201412;

public class ArrayInt10 {
	public static void main(String args[]){
		int[][] intArr = new int[10][10];
		System.out.println("-------------------- 上三角 -----------------------\n");
		for(int i = 0; i < intArr.length; i++){
			for(int j = 0; j < intArr[i].length; j++){
				if((i + j) <= (intArr[i].length - 1)){
					intArr[i][j] = 1;
				}else{
					intArr[i][j] = 0;
				}
			}
		}
		
		for(int[] item : intArr){
			for(int intValue : item){
				System.out.print(intValue + "	");
			}
			System.out.println("");
		}
		
		System.out.println("\n------------------- 下三角 ----------------------\n");
		for(int i = 0; i < intArr.length; i++){
			for(int j = 0; j < intArr[i].length; j++){
				if((i + j) >= (intArr[i].length - 1)){
					intArr[i][j] = 1;
				}else{
					intArr[i][j] = 0;
				}
			}
		}
		
		for(int[] item : intArr){
			for(int intValue : item){
				System.out.print(intValue + "	");
			}
			System.out.println("");
		}
	}
		
}
