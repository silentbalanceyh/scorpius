package com.sco.design.factory;

public class N2ExportOperate {
	public boolean export(int type,String data){
		N0ExportFileApi api = factoryMethod(type);
		return api.export(data);
	}
	
	protected N0ExportFileApi factoryMethod(int type){
		N0ExportFileApi api = null;
		if( type == 1){
			api = new N0ExportTxtFile();
		}else if( type == 2 ){
			api = new N0ExportDB();
		}
		return api;
	}
}
