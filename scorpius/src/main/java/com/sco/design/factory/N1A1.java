package com.sco.design.factory;

public abstract class N1A1 {
	protected abstract N1C createC1();
	
	public void t1(){
		createC1().tc();
	}
}
