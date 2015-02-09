package com.sco.design.factory.abs;

public class SConcreteFactory2 implements SAbstractFactory{

	public SAbstractProductA createProductA() {
		return new SProductA2();
	}

	public SAbstractProductB createProductB() {
		return new SProductB2();
	}

}
