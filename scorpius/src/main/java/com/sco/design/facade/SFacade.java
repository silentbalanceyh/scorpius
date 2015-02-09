package com.sco.design.facade;

public class SFacade {
	public void test(){
		SAModuleApi a = new SAModuleImpl();
		a.testA();
		SBModuleApi b = new SBModuleImpl();
		b.testB();
		SCModuleApi c = new SCModuleImpl();
		c.testC();
	}
}
