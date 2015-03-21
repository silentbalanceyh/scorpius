package com.sco._2nd.oo;

class EncapsulationObj1 {
	public String name = "Obj1";
}

class EncapsulationObj2 {
	private String name = "Obj2";

	public String getName() {
		return this.name;
	}
}

public class EncapsulationObj {
	public static void main(String args[]) {
		EncapsulationObj1 obj1 = new EncapsulationObj1();
		EncapsulationObj2 obj2 = new EncapsulationObj2();
		System.out.println(obj1.name);
		obj1.name = "Broken";
		System.out.println(obj1.name);
		System.out.println(obj2.getName());
	}
}
