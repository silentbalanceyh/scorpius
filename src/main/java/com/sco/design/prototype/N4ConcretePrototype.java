package com.sco.design.prototype;

public class N4ConcretePrototype implements N4Prototype{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public N4Prototype clone(){
		N4ConcretePrototype prototype = new N4ConcretePrototype();
		prototype.setName(name);
		return prototype;
	}
	
	public String toString(){
		return "Now in Prototype1, name=" + name;
	}
}
