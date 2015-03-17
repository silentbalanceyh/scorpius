package com.sco.design.prototype;

public class SConcretePrototype1 implements SPrototype{
	public SPrototype clone(){
		SPrototype prototype = new SConcretePrototype1();
		return prototype;
	}
}
