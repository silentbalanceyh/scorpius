package com.sco.daily._201412;

public class UseReturn {
	public static void main(String args[]){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.println("i = " + i + ", j = " + j);
				if(i == (j + 1)){
					return;
				}
			}
		}
	}
}
