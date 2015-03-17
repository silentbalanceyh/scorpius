package com.sco._2nd.oo.classes.statica;

class AnOtherClass{
	AnOtherClass() {
		System.out.println("In AnOtherClass::<init>");
	}
	static int foo = 24;
	static int bar(){
		return 42;
	}
}

public class InheritStatics extends AnOtherClass{
	public static void main(String args[]){
		new InheritStatics().run();
	}
	
	public void run(){
		System.out.println("In InheritStatics::run");
		System.out.println("Foo is " + foo);
		System.out.println("Bar is " + bar());
	}
}
