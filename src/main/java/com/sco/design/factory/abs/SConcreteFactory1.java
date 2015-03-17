package com.sco.design.factory.abs;

public class SConcreteFactory1 implements SAbstractFactory{

	public SAbstractProductA createProductA() {
		return new SProductA1();
	}

	public SAbstractProductB createProductB() {
		return new SProductB1();
	}

}
