package com.sco.design.factory.abs;

public class OMSIMainboard implements OMainboardApi{

	private int cpuHoles = 0;
	
	public OMSIMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	public void installCPU() {
		System.out.println("Now in MSIMainboard,cpuHoles=" + this.cpuHoles);
	}
	
}
