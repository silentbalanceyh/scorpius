package com.sco.design.factory;

public class N0ExportDB implements N0ExportFileApi{

	public boolean export(String data) {
		System.out.println("导出数据" + data + "到数据库备份文件");
		return false;
	}

}
