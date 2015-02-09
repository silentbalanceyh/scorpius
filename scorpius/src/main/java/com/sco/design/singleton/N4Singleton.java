package com.sco.design.singleton;

public class N4Singleton {
	public static void main(String args[]){
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s1);
	}
}

enum Singleton{
	INSTANCE;
	public static Singleton getInstance(){
		return INSTANCE;
	}
}
