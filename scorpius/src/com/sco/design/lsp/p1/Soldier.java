package com.sco.design.lsp.p1;
/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p1
 * @name Soldier
 * @class com.sco.design.lsp.p1.Soldier
 * @date Nov 29, 2014 11:27:41 AM
 * @see
 */
public class Soldier {
	// ����ʿ����ǹ֧
	private AbstractGun gun;
	// ��ʿ��һ֧ǹ
	public void setGun(AbstractGun _gun){
		this.gun = _gun;
	}
	public void killEnemy(){
		System.out.println("ʿ����ʼɱ���ˡ���");
		gun.shoot();
	}
}
