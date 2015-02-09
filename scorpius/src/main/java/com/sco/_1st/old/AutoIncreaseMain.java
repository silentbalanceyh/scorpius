package com.sco._1st.old;

public class AutoIncreaseMain {
	@SuppressWarnings("unused")
	public static void main(String args[]){
		int i = 4;
		int j = 6;
		int result = i+++ ++j + i+++ ++i + i + ++i;
		System.out.println("result:" + result);
		int a = 5;
		int result1 = a+++a+++a+++a++;
		int result2 = i++ +(++i);
		System.out.println("result1:" + result1);
	}
}
