package com.sco.design.singleton;
/**
 * 内部类方式实现单例模式
 * @author Lang Yu(lang.yu@hp.com)
 * @time Apr 13, 2011 8:44:41 PM
 * @file N3Singleton.java
 * @package com.sco.design.singleton
 * @version 1.0
 * @see
 */
public class N3Singleton {
	private static class SingletonHolder{
		private static N3Singleton instance = new N3Singleton();
	}
	
	private N3Singleton(){}
	
	public static N3Singleton getInstance(){
		return SingletonHolder.instance;
	}
}
