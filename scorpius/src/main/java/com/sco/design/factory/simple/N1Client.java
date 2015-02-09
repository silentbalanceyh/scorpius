package com.sco.design.factory.simple;

public class N1Client {
	public static void main(String args[]){
		OApi api = N1Factory.createApi(2);
		api.test1("哈哈，不要紧张，只是个测试而已！");
	}
}
