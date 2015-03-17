package com.sco.design.prototype;

import java.util.HashMap;
import java.util.Map;

public class N4PrototypeManager {
	private static Map<String,N4Prototype> map = 
		new HashMap<String,N4Prototype>();
	
	private N4PrototypeManager(){}
	
	public synchronized static void setPrototype(String prototypeId,N4Prototype prototype){
		map.put(prototypeId, prototype);
	}
	
	public synchronized static void removePrototype(String prototypeId){
		map.remove(prototypeId);
	}
	
	public synchronized static N4Prototype getPrototype(String prototypeId) throws Exception{
		N4Prototype prototype = map.get(prototypeId);
		if( prototype == null ){
			throw new Exception("你希望获取的原型还没有注册或已被销毁");
		}
		return prototype;
	}
}
