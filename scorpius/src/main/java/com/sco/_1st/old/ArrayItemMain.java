package com.sco._1st.old;

import java.util.Arrays;

public class ArrayItemMain {
	public static void main(String args[]){
		String[] arrayStrings = new String[3];
		for(int i = 0; i < arrayStrings.length; i++){
			arrayStrings[i] = new String("String" + i);
		}
		System.out.println(Arrays.asList(arrayStrings));
	}
}
