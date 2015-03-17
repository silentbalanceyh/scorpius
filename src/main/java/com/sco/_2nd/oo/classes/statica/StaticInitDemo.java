package com.sco._2nd.oo.classes.statica;

public class StaticInitDemo {
	static{
		System.out.println("In static initializer");
	}
	
	public StaticInitDemo(){
		System.out.println("In Constructor");
	}
	
	@SuppressWarnings({ "rawtypes" })
	public static void main(String args[]){
		try{
			System.err.println("About to load class");
			Class class1 = Class.forName("com.sco._2nd.oo.classes.statica.StaticInitDemo");
			System.err.println("About to construct instance");
			Object sdObject = class1.newInstance();
			System.err.println("Object is " + sdObject);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
