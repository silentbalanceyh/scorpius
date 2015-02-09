package com.sco._2nd.oo.classes.fields;


class Insect{
	private int i = 9;
	
	protected int j;
	
	Insect(){
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	
	@SuppressWarnings("unused")
	private static int x1 = print("static Insect.x1 initialized");
	
	static int print(String s){
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect{
	private int k = print("Beetle.k initialized");
	
	public Beetle(){
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	@SuppressWarnings("unused")
	private static int x2 = print("static Beetle.x2 initialized");
	
	public static void main(String args[]){
		System.out.println("Beetle constructor");
		@SuppressWarnings("unused")
		Beetle beetle = new Beetle();
	}
}
