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
		// ������ë���ʿ��
		Soldier sanMao = new Soldier();
		// ����ëһ֧ǹ
		sanMao.setGun(new ToyGun());
		sanMao.killEnemy();
	}
}
