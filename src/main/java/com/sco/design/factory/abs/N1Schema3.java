package com.sco.design.factory.abs;

public class N1Schema3 implements N1AbstractFactory{
	public Object createProduct(int type){
		Object retObj = null;
		if( type == 1 ){
			retObj = new OIntelCPU(1156);
		}else if( type == 2 ){
			retObj = new OGAMainboard(1156);
		}else if( type == 3 ){
			retObj = new N1HyMemory();
		}
		return retObj;
	}
}
