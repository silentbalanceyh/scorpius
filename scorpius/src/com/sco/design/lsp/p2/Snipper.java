package com.sco.design.lsp.p2;


/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p2
 * @name Snipper
 * @class com.sco.design.lsp.p2.Snipper
 * @date Nov 29, 2014 11:44:05 AM
 * @see
 */
public class Snipper {
	// ����ʿ����ǹ֧
	private AUG gun;
	// ��ʿ��һ֧ǹ
	public void setRifle(AUG _gun){
		this.gun = _gun;
	}
	
	public void killEnemy(){
		// ���ȿ������˵��������ɱ�����ˣ��Լ�Ҳ���˸ɵ�
		gun.zoomOut();
		// ��ʼ���
		gun.shoot();
	}
}
