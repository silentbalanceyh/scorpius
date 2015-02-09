package com.sco.design.factory;

public abstract class SCreator {
	
	protected abstract SProduct factoryMethod();
	
	public void someOperation(){
		@SuppressWarnings("unused")
		SProduct product = factoryMethod();
	}
}
