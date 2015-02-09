package com.sco._2nd.oo.classes.constructor;

class Art{
	Art(){
		System.out.println("Art constructor");
	}
}

class Drawing extends Art{
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

public class Cartoon extends Drawing{
	public Cartoon(){
		System.out.println("Cartoon constructor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Cartoon cartoon = new Cartoon();
	}
}
