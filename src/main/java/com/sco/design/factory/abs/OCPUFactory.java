package com.sco.design.factory.abs;

public class OCPUFactory {
	public static OCPUApi createCPUApi(int type){
		OCPUApi cpu = null;
		if( type == 1 ){
			cpu = new OIntelCPU(1156);
		}else if( type == 2){
			cpu = new OAMDCPU(939);
		}
		return cpu;
	}
}
