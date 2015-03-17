package com.sco.design.prototype;

public class SConcretePrototype2 implements SPrototype{
	public SPrototype clone(){
		SPrototype prototype = new SConcretePrototype2();
		return prototype;
	}
}
