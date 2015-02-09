package com.sco.design.singleton;
/**
 * 同步安全问题，另外一种实现单例模式
 * @author Lang Yu(lang.yu@hp.com)
 * @time Apr 13, 2011 8:38:47 PM
 * @file N2Singleton.java
 * @package com.sco.design.singleton
 * @version 1.0
 * @see
 */
public class N2Singleton {
	private volatile static N2Singleton instance = null;
	
	private N2Singleton(){}
	
	public static N2Singleton getInstance(){
		if( instance == null ){
			synchronized(N2Singleton.class){
				if( instance == null ){
					instance = new N2Singleton();
				}
			}
		}
		return instance;
	}

}
