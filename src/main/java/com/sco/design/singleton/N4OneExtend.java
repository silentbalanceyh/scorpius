package com.sco.design.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N4OneExtend {
	private final static String DEFAULT_PREKEY = "Cache";
	
	private static Map<String,N4OneExtend> map = new HashMap<String,N4OneExtend>();
	
	private static int num = 1;
	
	private final static int NUM_MAX = 3;
	
	private N4OneExtend(){}
	
	public static N4OneExtend getInstance(){
		String key = DEFAULT_PREKEY + num;
		N4OneExtend oneExtend = map.get(key);
		if(oneExtend == null){
			oneExtend = new N4OneExtend();
			map.put(key, oneExtend);
		}
		num++;
		if( num > NUM_MAX){
			num = 1;
		}
		return oneExtend;
	}
	
	public static void main(String args[]){
		List<N4OneExtend> list = new ArrayList<N4OneExtend>();
		for( int i = 0; i < 12; i++ ){
			N4OneExtend obj = getInstance();
			list.add(obj);
		}
		
		for( N4OneExtend obj: list){
			System.out.println("obj=" + obj);
		}
	}
}
