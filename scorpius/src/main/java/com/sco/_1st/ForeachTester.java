package com.sco._1st;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ForeachTester
 * @class com.sco._1st.ForeachTester
 * @date Dec 10, 2014 1:37:08 PM
 * @see
 */
public class ForeachTester {
	public static void main(String args[]){
		final String[] str = {"Hello","Lang","World","Yu"};
		for(final String item: str){
			System.out.println(item);
		}
		
		final List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(100);
		list.add(300);
		for(final Integer item: list){
			System.out.println("\t" + item);
		}
	}
}
