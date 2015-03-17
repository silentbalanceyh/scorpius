package com.sco.daily._201412;

public class UseContinue {
	public static void main(String args[]){
		System.out.println("------------- continue ---------------");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.println("i = " + i + ", j = " + j);
				if(i == j){
					continue;
				}
			}
		}
		
		System.out.println("-------------- continue - outer ----------------");
		outer:
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.println("i = " + i + ", j = " + j);
				if(i == j){
					continue outer;
				}
			}
		}
	}
}
