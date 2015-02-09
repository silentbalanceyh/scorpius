package com.sco._2nd.oo.work.copy;

/*
 * 先父类，到子类。 先静态，到成员
 */
public class Cartoon extends Drawing{
	public static void main(String args[]){
		System.out.println("Test the order");
		@SuppressWarnings("unused")
		Cartoon cartoon = new Cartoon();
	
	}
	
	public Cartoon(){
		System.out.println("Cartoon constructor");
	}
}
class Art{
	Art(){
		System.out.println("Art constructor");
	}
}
class Drawing extends Art{
	static void fun(){
		System.out.println("Drawing - static function");
	}
	static{
		System.out.println("Drawing - static block"); 
	}
	Drawing(){
		System.out.println("Drawing constructor");
	}
	
}

