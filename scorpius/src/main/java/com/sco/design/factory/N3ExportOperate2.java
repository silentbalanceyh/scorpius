package com.sco.design.factory;

public class N3ExportOperate2 extends N2ExportOperate{
	protected N0ExportFileApi factoryMethod(int type){
		N0ExportFileApi api = null;
		if( type == 3 ){
			api = new N3ExportXml();
		}else{
			api = super.factoryMethod(type);
		}
		return api;
	}
}
