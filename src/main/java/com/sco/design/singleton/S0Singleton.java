package com.sco.design.singleton;
/**
 * 懒汉方式单例
 * @author Lang Yu(lang.yu@hp.com)
 * @time Apr 13, 2011 8:18:42 PM
 * @file SSingleton.java
 * @package com.sco.design.singleton
 * @version 1.0
 * @see
 */
public class S0Singleton {
	private static S0Singleton uniqueInstance = null;
	
	private S0Singleton(){}
	
	public static synchronized S0Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new S0Singleton();
		}
		return uniqueInstance;
	}
	
	public void singletonOperation(){}
	
	private String singletonData;
	
	public String getSingletonData(){
		return this.singletonData;
	}
}
