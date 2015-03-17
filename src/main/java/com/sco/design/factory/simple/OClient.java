package com.sco.design.factory.simple;

public class OClient {
	public static void main(String args[]){
		OApi api = new OImpl();
		api.test1("哈哈，不要紧张，只是个测试而已！");
	}
}
