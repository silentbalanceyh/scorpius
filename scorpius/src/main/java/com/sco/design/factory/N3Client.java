package com.sco.design.factory;

public class N3Client {
	public static void main(String args[]){
		N2ExportOperate operate = new N3ExportOperate2();
		operate.export(1, "Txt数据");
		operate.export(2, "Db数据");
		operate.export(3, "Xml数据");
	}
}
