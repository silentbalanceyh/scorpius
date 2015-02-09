package com.sco.design.mediator;

public class N0Client {
	public static void main(String args[]){
		N0MotherBoard mediator = new N0MotherBoard();
		
		N0CDDriver cd = new N0CDDriver(mediator);
		
		N0CPU cpu = new N0CPU(mediator);
		
		N0VideoCard vc = new N0VideoCard(mediator);
		N0SoundCard sc = new N0SoundCard(mediator);
		
		mediator.setCdDriver(cd);
		mediator.setCpu(cpu);
		mediator.setVideoCard(vc);
		mediator.setSoundCard(sc);
		
		cd.readCD();
	}
}
