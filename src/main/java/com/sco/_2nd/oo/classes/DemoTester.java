package com.sco._2nd.oo.classes;

class Demo {
	int i;
}

public class DemoTester extends Demo {
	public void run(Demo a) {
		int x = a.i; // a语句
		int y = i; // b语句
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[]){
		Demo a = new Demo();
		new DemoTester().run(a);
	}
}