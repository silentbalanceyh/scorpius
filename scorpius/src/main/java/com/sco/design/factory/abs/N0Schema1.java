package com.sco.design.factory.abs;

public class N0Schema1 implements N0AbstractFactory{

	public OCPUApi createCPUApi() {
		return new OIntelCPU(1156);
	}

	public OMainboardApi createMainboardApi() {
		return new OGAMainboard(1156);
	}

}
