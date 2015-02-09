package com.sco.design.mediator;

public class N0SoundCard extends N0Colleague{

	public N0SoundCard(N0Mediator mediator) {
		super(mediator);
	}
	
	public void soundData(String data){
		System.out.println("画外音：" + data);
	}
	
}
