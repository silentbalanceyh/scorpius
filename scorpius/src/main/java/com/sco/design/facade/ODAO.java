package com.sco.design.facade;

public class ODAO {
	public void generate(){
		OConfigModel cm = OConfigManager.getInstance().getConfigData();
		if( cm.isNeedGenDAO()){
			System.out.println("正在生成数据层代码文件");
		}
	}
}
