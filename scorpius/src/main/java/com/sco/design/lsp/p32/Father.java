package com.sco.design.lsp.p32;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p31
 * @name Father
 * @class com.sco.design.lsp.p31.Father
 * @date Nov 29, 2014 11:58:58 AM
 * @see
 */
public class Father {
	@SuppressWarnings("rawtypes")
	public Collection doSomething(Map map){
		System.out.println("父类被执行……");
		return map.values();
	}
}
