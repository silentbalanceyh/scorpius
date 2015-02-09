package com.sco.design.factory.abs;

public class N1ComputerEngineer {
	private OCPUApi cpu = null;
	private OMainboardApi mainboard = null;
	
	private N1MemoryApi memory = null;
	public void makComputer(N1AbstractFactory schema){
		prepereHardwares(schema);
	}

	private void prepereHardwares(N1AbstractFactory schema) {
		this.cpu = (OCPUApi)schema.createProduct(1);
		this.mainboard = (OMainboardApi)schema.createProduct(2);
		this.memory = (N1MemoryApi)schema.createProduct(3);
		
		this.cpu.calculate();
		this.mainboard.installCPU();
		if( memory != null ){
			this.memory.cacheData();
		}
	}
}
