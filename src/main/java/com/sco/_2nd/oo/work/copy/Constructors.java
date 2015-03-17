package com.sco._2nd.oo.work.copy;

public class Constructors {
	public Constructors(){
		System.out.println("In the constructor");
	}
	/*
	 * 通过改变参数个数重载函数
	 */
	public Constructors(int value){
		if(value < 0){
			throw new IllegalArgumentException("Constructors : value < 0");
		}
	}
	/*
	 * 不能通过修改返回值来重载函数
	public void Constructors(){
		System.out.println("In void Constructor()");
	}
	*/
	
	void method1(){
		for(int i = 0; i < 5; i++){
			System.out.println("method1 : " + i);
		}
	}
	public static void main(String args[]){
		Constructors l = new Constructors();
		l.method1();
		// What
	//	l.Constructors();
		Constructors i = new Constructors(-1);
		i.method1();
	}
}
