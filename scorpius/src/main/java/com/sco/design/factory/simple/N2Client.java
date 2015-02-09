package com.sco.design.factory.simple;

public class N2Client {
	public static void main(String args[]){
		OApi api = N2Factory.createApi();
		api.test1("哈哈，不要紧，只是个测试而已！");
	}
}
