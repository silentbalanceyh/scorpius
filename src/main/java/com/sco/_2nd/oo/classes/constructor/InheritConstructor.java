package com.sco._2nd.oo.classes.constructor;

class SomeOtherClass{
	public SomeOtherClass() {
		System.out.println("In SomeOtherClass::<init>");
	}
}

public class InheritConstructor extends SomeOtherClass{
	public void run(){
		System.out.println("In InheritConstructor::run");
	}
	
	public static void main(String[] c){
		new InheritConstructor().run();
	}
}
