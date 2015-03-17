package com.sco._1st.old;

public class ForLoopMain {
	public static void main(String args[]){
		String[] arrayStrings = {"A","B","C"};
		//进行arrayStrings的遍历
		for( int i= 0; i < arrayStrings.length; i++){
			System.out.println(arrayStrings[i]);
		}
		System.out.println("---------------");
		for(String item:arrayStrings){
			System.out.println(item);
		}
	}
}
