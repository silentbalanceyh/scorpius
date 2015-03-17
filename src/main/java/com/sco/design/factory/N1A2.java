package com.sco.design.factory;

public class N1A2 extends N1A1{

	@Override
	protected N1C createC1() {
		return new N1C2();
	}

}
