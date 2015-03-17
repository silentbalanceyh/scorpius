package com.sco.design.singleton;
/**
 * 饿汉方式单例
 * @author Lang Yu(lang.yu@hp.com)
 * @time Apr 13, 2011 8:21:14 PM
 * @file S1Singleton.java
 * @package com.sco.design.singleton
 * @version 1.0
 * @see
 */
public class S1Singleton {
	private static S1Singleton uniqueInstance = new S1Singleton();
	
	private S1Singleton(){}
	
	public static S1Singleton getInstance(){
		return uniqueInstance;
	}
	
	public void singletonOperation(){}
	
	private String singletonData;
	
	public String getSingletonData(){
		return this.singletonData;
	}
}
