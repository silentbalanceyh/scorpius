package com.sco.design.singleton;

import java.util.HashMap;
import java.util.Map;

public class N1JavaCache {
	private Map<String,Object> map = new HashMap<String,Object>();
	
	public Object getValue(String key){
		Object obj = map.get(key);
		if( obj == null ){
			obj = key + ",value";
			map.put(key, obj);
		}
		return obj;
	}
}
