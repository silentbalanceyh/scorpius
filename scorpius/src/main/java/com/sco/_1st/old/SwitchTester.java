package com.sco._1st.old;

import java.util.Random;

public class SwitchTester {
	public static void main(String args[]){
		Random random = new Random();
		int result = random.nextInt(4);
		System.out.println(result);
		switch (result) {
		default:
			System.out.println("Result is 4");
			
		case 1:
			System.out.println("Result is 1");
			break;
		case 2:
			System.out.println("Result is 2");
		case 3:
			System.out.println("Result is 3");
			break;
		case 4:
			break;
		}
	}
}
