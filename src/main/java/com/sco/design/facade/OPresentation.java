package com.sco.design.facade;

public class OPresentation {
	public void generate(){
		OConfigModel cm = OConfigManager.getInstance().getConfigData();
		if( cm.isNeedGenPresentation()){
			System.out.println("正在生成表现层代码文件。");
		}
	}
}
