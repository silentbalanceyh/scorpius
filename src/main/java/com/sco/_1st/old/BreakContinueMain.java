package com.sco._1st.old;

public class BreakContinueMain {
	public static void main(String args[]){
		System.out.println("Break Loop");
		for( int i = 0; i < 4; i++){
			if( i == 2)
				break;
			System.out.println("Loop " + i);
		}
		System.out.println("Continue Loop");
		for( int i = 0; i < 4; i++){
			if( i == 2)
				continue;
			System.out.println("Loop " + i);
		}
	}
}
