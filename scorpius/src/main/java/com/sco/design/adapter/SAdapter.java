package com.sco.design.adapter;

public class SAdapter implements STarget{
	
	private SAdaptee adatper;
	
	public SAdapter(SAdaptee adapter){
		this.adatper = adapter;
	}
	
	public void request() {
		this.adatper.specificRequest();
	}

}
