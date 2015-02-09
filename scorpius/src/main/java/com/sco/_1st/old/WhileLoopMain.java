package com.sco._1st.old;

public class WhileLoopMain {
	public static void main(String args[]){
		int i = 4; 
		System.out.println("While loop:");
		while(i < 4){
			System.out.println(i);
			i++;
		}
		i = 4;
		System.out.println("Do While loop:");
		do{
			System.out.println(i);
			i++;
		}while(i < 4);
	}
}
