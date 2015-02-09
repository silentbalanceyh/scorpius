package com.sco.design.factory.abs;

public class OAMDCPU implements OCPUApi{
	private int pins = 0;
	
	public OAMDCPU(int pins){
		this.pins = pins;
	}
	
	public void calculate(){
		System.out.println("Now in AMD CPU,pins=" + pins);
	}
}
