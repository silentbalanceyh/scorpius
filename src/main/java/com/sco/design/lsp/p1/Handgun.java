package com.sco.design.lsp.p1;
/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p1
 * @name Handgun
 * @class com.sco.design.lsp.p1.Handgun
 * @date Nov 29, 2014 11:24:17 AM
 * @see
 */
public class Handgun extends AbstractGun{
	// 手枪的特点是携带方便，射程短
	@Override
	public void shoot() {
		System.out.println("手枪射击……");
	}

}
