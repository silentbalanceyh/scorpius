package com.sco.design.factory;

public abstract class N0ExportOperate {
	public boolean export(String data){
		N0ExportFileApi api = factoryMethod();
		return api.export(data);
	}
	
	protected abstract N0ExportFileApi factoryMethod();
}
