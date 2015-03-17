package com.sco.design.builder;

public class SDirector {
	private SBuilder builder;
	
	public SDirector(SBuilder builder){
		this.builder = builder;
	}
	
	public void construct(){
		builder.buildPart();
	}
}
