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
	// 定义士兵的枪支
	private AbstractGun gun;
	// 给士兵一支枪
	public void setGun(AbstractGun _gun){
		this.gun = _gun;
	}
	public void killEnemy(){
		System.out.println("士兵开始杀敌人……");
		gun.shoot();
	}
}
