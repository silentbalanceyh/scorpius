package com.sco.design.prototype;

public class SClient {
	
	private SPrototype prototype;
	
	public SClient(SPrototype prototype){
		this.prototype = prototype;
	}
	
	public void operation(){
		@SuppressWarnings("unused")
		SPrototype newPrototype = prototype.clone();
	}
}
