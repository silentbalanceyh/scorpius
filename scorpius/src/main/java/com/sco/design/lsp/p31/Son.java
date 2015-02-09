package com.sco.design.lsp.p31;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p31
 * @name Son
 * @class com.sco.design.lsp.p31.Son
 * @date Nov 29, 2014 12:00:06 PM
 * @see
 */
public class Son extends Father{
	// 放大输入的参数类型
	@SuppressWarnings("rawtypes")
	// @Override Incorrect方法名相同但参数不同，不是覆写，是重载！Overloading
	public Collection doSomething(Map map){
		System.out.println("子类被执行……");
		return map.values();
	}
}
