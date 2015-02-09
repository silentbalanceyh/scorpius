package com.sco.design.factory.simple;

public class N0Client {
	public static void main(String args[]){
		OApi api = N0Factory.createApi();
		api.test1("哈哈，不要紧张，只是个简单工厂的测试！");
	}
}
