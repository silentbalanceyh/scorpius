package com.sco.core;

public class TestClass {
	private transient int age;
	private String name;
	
	public TestClass(final String name, final int age){
		this.age = age;
		this.name = name;
	}
	
	public int inc(){
		System.out.println(this.name);
		return age + 1;
	}
	
}
