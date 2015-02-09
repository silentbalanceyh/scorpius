package com.sco.design.lsp.p1;
/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p1
 * @name Client
 * @class com.sco.design.lsp.p1.Client
 * @date Nov 29, 2014 11:29:31 AM
 * @see
 */
public class Client {
	public static void main(String args[]){
		// 产生三毛这个士兵
		Soldier sanMao = new Soldier();
		// 给三毛一支枪
		sanMao.setGun(new ToyGun());
		sanMao.killEnemy();
	}
}
