package com.sco.design.factory.abs;

public class N0ComputerEngineer {
	private OCPUApi cpu = null;
	
	private OMainboardApi mainboard = null;
	
	public void makComputer(N0AbstractFactory schema){
		prepereHardwares(schema);
	}

	private void prepereHardwares(N0AbstractFactory schema) {
		this.cpu = schema.createCPUApi();
		this.mainboard = schema.createMainboardApi();
		
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
