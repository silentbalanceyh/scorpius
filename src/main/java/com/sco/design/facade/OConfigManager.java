package com.sco.design.facade;

public class OConfigManager {
	private static OConfigManager manager = null;
	private static OConfigModel cm = null;
	private OConfigManager(){}
	public static OConfigManager getInstance(){
		if( manager == null ){
			manager = new OConfigManager();
			cm = new OConfigModel();
		}
		return manager;
	}
	
	public OConfigModel getConfigData(){
		return cm;
	}
}
