package com.sco.design.factory;

public class SConcreteCreator extends SCreator{

	@Override
	protected SProduct factoryMethod() {
		return new SConcreteProduct();
	}

}
