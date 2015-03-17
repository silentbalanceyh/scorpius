package com.sco.design.factory.simple;

public class OImpl implements OApi{
	public void test1(String s) {
		System.out.println("Now in Impl. The input s == " + s);
	}
}
