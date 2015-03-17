package com.sco.java2s.dt.box;
/**
 * 
 * @author Lang
 * @package com.sco.java2s.dt.box
 * @name AutoBoxDemo
 * @class com.sco.java2s.dt.box.AutoBoxDemo
 * @date Nov 26, 2014 9:21:16 PM
 * @see
 */
public class AutoBoxDemo {
	public static void main(String args[]){
		int i = 42;
		foo(i);
	}
	public static void foo(Integer i){
		System.out.println("Object = " + i);
	}
}
