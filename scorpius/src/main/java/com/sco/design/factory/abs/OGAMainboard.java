package com.sco.design.factory.abs;

public class OGAMainboard implements OMainboardApi{

	private int cpuHoles = 0;
	
	public OGAMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	public void installCPU() {
		System.out.println("Now in GAMainboard,cpuHoles=" + this.cpuHoles);
	}

}
