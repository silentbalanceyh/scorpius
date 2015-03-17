package com.sco._2nd.oo.classes.access;

public class MySingleton {
	private static MySingleton theObject;
	
	public static MySingleton createMySingleton(){
		if( theObject == null )
			theObject = new MySingleton();
		return theObject;
	}
	
	public static void main(String[] args){
		MySingleton ms1 = MySingleton.createMySingleton();
		MySingleton ms2 = MySingleton.createMySingleton();
		System.out.println(ms1 == ms2);
	}
}
