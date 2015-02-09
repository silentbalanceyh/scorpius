package com.sco.design.factory.simple;
/**
 * 
 * @author yulan
 * 把第一个例子，S前缀的转换成为工厂模式
 */
public class N0Factory {
	public static OApi createApi(){
		return new OImpl();
	}
}
