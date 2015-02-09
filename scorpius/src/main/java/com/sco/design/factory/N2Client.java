package com.sco.design.factory;

public class N2Client {
	public static void main(String args[]){
		N2ExportOperate operate = new N2ExportOperate();
		operate.export(1, "测试数据");
	}
}
