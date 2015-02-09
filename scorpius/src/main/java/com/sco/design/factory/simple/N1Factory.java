package com.sco.design.factory.simple;
/**
 * 通过客户端的输入来选择不同的实现部分
 * 实际上：简单工厂做的事情就是选择某个接口的实现，对调用者隐藏掉实现部分
 * @author yulan
 *
 */
public class N1Factory {
	public static OApi createApi(int type){
		OApi api = null;
		if( type == 1 ){
			api = new OImpl();
		}else if(type == 2){
			api = new N1Impl2();
		}
		return api;
	}
}
