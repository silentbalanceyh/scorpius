package com.sco.daily._201412;

public class UseBreak {
	public static void main(String args[]){
		System.out.println("------------ break --------------");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.println("i = " + i + ", j = " + j);
				if(i == j){
					break;
				}
			}
		}
		System.out.println("------------ break - outer --------------");
		outer:
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.println("i = " + i + ", j = " + j);
				if(i == j){
					break outer;
				}
			}
		}
	}

}
