package com.sco.design.factory.abs;

public class OIntelCPU implements OCPUApi{

	private int pins = 0;
	
	public OIntelCPU(int pins){
		this.pins = pins;
	}
	
	public void calculate() {
		System.out.println("Now in Intel CPU,pins=" + pins);
	}

}
