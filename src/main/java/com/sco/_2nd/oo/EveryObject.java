package com.sco._2nd.oo;

public class EveryObject {
	// ~ Static Methods ======================================
	public static void main(String args[]) {
		EveryObject obj = new EveryObject();
		System.out.println("Current Class : " + obj.getClass().getName());
		System.out.println("Primative Type : " + int.class.getSuperclass());
	}

	// ~ Constructors ========================================
	public EveryObject() {
		Class<?> parent = getClass().getSuperclass();
		System.out.println("Default Class :" + parent.getName());
		System.out.println("What's the top Level ? : " + parent.getSuperclass());
	}
}
