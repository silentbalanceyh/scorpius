package com.sco.design.lsp.p2;


/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p2
 * @name Client
 * @class com.sco.design.lsp.p2.Client
 * @date Nov 29, 2014 11:45:15 AM
 * @see p2����˵�����������ӵ���Լ��ĸ��ԣ�������ĳЩ�ط���������Գ���ʱ����δ�ؾͿ��Գ���
 */
public class Client {
	public static void main(String args[]){
		// ��ë�ѻ���
		Snipper sanMao = new Snipper();
		// sanMao.setRifle((AUG)(new Rifle())); Incorrect class casting
		sanMao.setRifle(new AUG());
		sanMao.killEnemy();
	}
}
