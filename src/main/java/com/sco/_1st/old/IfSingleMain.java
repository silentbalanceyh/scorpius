package com.sco._1st.old;

import java.util.Random;

public class IfSingleMain {
	public static void main(String args[]){
		Random random = new Random();
		int result = random.nextInt(3);
		if( result == 2){
			System.out.print("This is if block,");
			System.out.println("Test block flow.");
		}else if( result == 1){
			System.out.println("This is if single flow.");
			System.out.println("This is Inner or Outer."); 
		}else {
			System.out.print("This is other flow.");
			System.out.println("This is single else flow."); 
		}
		System.out.println("Main flow.");
	}
}
