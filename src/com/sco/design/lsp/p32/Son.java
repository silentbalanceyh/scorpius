package com.sco.design.lsp.p32;

import java.util.Collection;
import java.util.HashMap;

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
	// ������С����Ĳ�������
	@SuppressWarnings("rawtypes")
	// @Override Incorrect��������ͬ��������ͬ�����Ǹ�д�������أ�Overloading
	public Collection doSomething(HashMap map){
		System.out.println("���౻ִ�С���");
		return map.values();
	}
}
