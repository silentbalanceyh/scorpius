package com.sco.design.factory.abs;

public class OComputerEngineer {
	private OCPUApi cpu = null;
	
	private OMainboardApi mainboard = null;
	
	public void makComputer(int cpuType,int mainboardType){
		preparedHardwares(cpuType,mainboardType);
	}
	
	private void preparedHardwares(int cpuType,int mainboardType){
		this.cpu = OCPUFactory.createCPUApi(cpuType);
		this.mainboard = OMainboardFactory.createMainboardApi(mainboardType);
		
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
