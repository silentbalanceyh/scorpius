package com.sco.design.lsp.p2;

import com.sco.design.lsp.p1.Rifle;

/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p2
 * @name AUG
 * @class com.sco.design.lsp.p2.AUG
 * @date Nov 29, 2014 11:42:18 AM
 * @see
 */
public class AUG extends Rifle{
	// 狙击枪都携带一个精准的望远镜
	public void zoomOut(){
		System.out.println("通过望远镜看敌人……");
	}
	
	public void shoot(){
		System.out.println("AUG射击……");
	}
}
