package com.sco.design.facade;

public class OBusiness {
	public void generate(){
		OConfigModel cm = OConfigManager.getInstance().getConfigData();
		if( cm.isNeedGenBusiness()){
			System.out.println("正在生成逻辑层代码文件");
		}
	}
}
