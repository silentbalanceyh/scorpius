package com.sco.design.factory;

public class N1A {
	private N1C c = null;
	
	public void setC(N1C c){
		this.c = c;
	}
	
	public void t1(){
		c.tc();
	}
}
