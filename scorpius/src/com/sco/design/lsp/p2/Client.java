package com.sco.design.lsp.p2;


/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p2
 * @name Client
 * @class com.sco.design.lsp.p2.Client
 * @date Nov 29, 2014 11:45:15 AM
 * @see p2法则说明了子类可以拥有自己的个性，而且在某些地方：子类可以出现时父类未必就可以出现
 */
public class Client {
	public static void main(String args[]){
		// 三毛狙击手
		Snipper sanMao = new Snipper();
		// sanMao.setRifle((AUG)(new Rifle())); Incorrect class casting
		sanMao.setRifle(new AUG());
		sanMao.killEnemy();
	}
}
