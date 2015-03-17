package com.sco.design.factory;

public class N0ExportTxtFileOperate extends N0ExportOperate{
	protected N0ExportFileApi factoryMethod(){
		return new N0ExportTxtFile();
	}
}
