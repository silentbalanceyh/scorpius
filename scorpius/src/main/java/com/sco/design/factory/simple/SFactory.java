package com.sco.design.factory.simple;

public class SFactory {
	public static SApi createApi(int condition){
		SApi api = null;
		if( condition == 1){
			api = new SImplA();
		}else if( condition == 2 ){
			api = new SImplB();
		}
		return api;
	}
}
