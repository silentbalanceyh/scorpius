package com.sco.daily._201412;

public class ArrayBoolean {
	public static void main(String args[]){
		boolean[][] booleanArr = new boolean[8][8];
		for(int i = 0; i < booleanArr.length; i++){
			for(int j = 0; j < booleanArr[i].length; j++){
				if((i+j) % 4 == 0){
					booleanArr[i][j] = false;
				}else{
					booleanArr[i][j] = true;
				}	
			}
		}
		
		for(boolean[] item : booleanArr){
			for(boolean booleanValue : item){
				System.out.print(booleanValue + "	");
			}
			System.out.println();
		}
	}

}
