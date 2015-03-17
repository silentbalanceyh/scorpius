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
		// 父类存在的地方，子类就应该能够存在，下边两行的代码输出不一样
		// Father f = new Father();
		Son f = new Son();
		HashMap map = new HashMap();
		f.doSomething(map);
	}
	
	public static void main(String args[]){
		invoker();
	}
}
