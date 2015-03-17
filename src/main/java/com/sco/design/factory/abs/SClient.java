package com.sco.design.factory.abs;

public class SClient {
	public static void main(String args[]){
		SAbstractFactory f = new SConcreteFactory1();
		f.createProductA();
		f.createProductB();
	}
}
