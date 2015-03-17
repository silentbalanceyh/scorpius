package com.sco.design.factory;

public class N3ExportXml implements N0ExportFileApi {

	public boolean export(String data) {
		System.out.println("导出数据" + data + "到XML文件");
		return false;
	}

}
