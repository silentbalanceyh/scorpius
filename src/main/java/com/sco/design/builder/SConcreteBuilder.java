package com.sco.design.builder;

public class SConcreteBuilder implements SBuilder{
	
	private SProduct resultProduct;
	
	public SProduct getResult(){
		return resultProduct;
	}

	public void buildPart() {
		
	}
	
}
