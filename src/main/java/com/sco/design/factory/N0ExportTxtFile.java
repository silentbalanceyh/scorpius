package com.sco.design.factory;

public class N0ExportTxtFile implements N0ExportFileApi{

	public boolean export(String data) {
		System.out.println("导出数据" + data + "到文本文件");
		return false;
	}
	
}
