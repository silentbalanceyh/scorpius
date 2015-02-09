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
	// 定义士兵的枪支
	private AUG gun;
	// 给士兵一支枪
	public void setRifle(AUG _gun){
		this.gun = _gun;
	}
	
	public void killEnemy(){
		// 首先看看敌人的情况，别杀死敌人，自己也被人干掉
		gun.zoomOut();
		// 开始射击
		gun.shoot();
	}
}
