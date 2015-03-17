package com.sco.design.mediator;

public class N0CDDriver extends N0Colleague{
	
	public N0CDDriver(N0Mediator mediator) {
		super(mediator);
	}
	
	private String data = "";
	
	public String getData(){
		return this.data;
	}
	
	public void readCD(){
		this.data = "设计模式,值得好好研究";
		this.getMediator().changed(this);
	}

}
