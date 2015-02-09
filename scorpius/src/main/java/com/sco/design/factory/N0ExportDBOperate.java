package com.sco.design.factory;

public class N0ExportDBOperate extends N0ExportOperate{
	protected N0ExportFileApi factoryMethod(){
		return new N0ExportDB();
	}
}
