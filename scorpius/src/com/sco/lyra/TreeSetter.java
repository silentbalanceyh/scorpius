package com.sco.lyra;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetter {
	public static void main(String args[]){
		Set<Integer> test = new TreeSet<>();
		test.add(3);
		test.add(1);
		test.add(4);
		for( Integer item: test){
			System.out.println(item);
		}
	}
}
