package com.sco.design.singleton;

public class N0Client {
	public static void main(String args[]){
		N0AppConfig config = N0AppConfig.getInstance();
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		System.out.println("paramA=" + paramA + ",paramB=" + paramB);
	}
}
