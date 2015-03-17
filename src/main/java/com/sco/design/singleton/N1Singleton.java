package com.sco.design.singleton;

import java.util.HashMap;
import java.util.Map;

public class N1Singleton {
	private final static String DEFAULT_KEY = "One";
	
	private static Map<String,N1Singleton> map = 
		new HashMap<String,N1Singleton>();
	
	private N1Singleton(){}
	
	public static N1Singleton getInstance(String key){
		N1Singleton instance = (N1Singleton)map.get(DEFAULT_KEY);
		
		if( instance == null ){
			instance = new N1Singleton();
			map.put(DEFAULT_KEY, instance);
		}
		
		return instance;
	}
}
