package com.sco.design.lsp.p32;

import java.util.HashMap;

/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p31
 * @name Client
 * @class com.sco.design.lsp.p31.Client
 * @date Nov 29, 2014 12:02:55 PM
 * @see
 */
public class Client {
	@SuppressWarnings("rawtypes")
	public static void invoker(){
		// ������ڵĵط��������Ӧ���ܹ����ڣ��±����еĴ��������һ��
		// Father f = new Father();
		Son f = new Son();
		HashMap map = new HashMap();
		f.doSomething(map);
	}
	
	public static void main(String args[]){
		invoker();
	}
}
