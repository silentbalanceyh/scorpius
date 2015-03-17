package com.sco.design.factory;

public class N0Client {
	public static void main(String args[]){
		N0ExportOperate operate = new N0ExportDBOperate();
		operate.export("测试数据");
	}
}
