package com.sco.design.prototype;

public class N4ConcretePrototype2 implements N4Prototype{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public N4Prototype clone(){
		N4ConcretePrototype2 prototype = new N4ConcretePrototype2();
		prototype.setName(this.name);
		return prototype;
	}
	
	public String toString(){
		return "Now in Prototype2, name=" + name;
	}
}
