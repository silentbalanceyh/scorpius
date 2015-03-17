package com.sco.design.factory.simple;

public class SClient {
	public static void main(String args[]){
		SApi api = SFactory.createApi(1);
		api.operation("正在使用简单工厂");
	}
}
