package com.sco.design.singleton;

public class OClient {
	public static void main(String args[]){
		OAppConfig config = new OAppConfig();
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		System.out.println("paramA=" + paramA + ",paramB=" + paramB);
	}
}
