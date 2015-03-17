package com.sco._2nd.oo.work.copy;

public class MySingleton {
	private static MySingleton theObject;
	
	public static MySingleton createMySingleton(){
		if( null == theObject ){
			theObject = new MySingleton();
		}
		return theObject;
	}
	
	public static void main(String args[]){
		MySingleton MySingleton1 = MySingleton.createMySingleton();
		MySingleton MySingleton2 = MySingleton.createMySingleton();
		System.out.println("MySingleton1 == MySingleton2 : " + (MySingleton1 == MySingleton2));
		System.out.println("MySingleton1.equals(MySingleton2) : " + MySingleton1.equals(MySingleton2));
	}

}
