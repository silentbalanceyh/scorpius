package com.sco.design.lsp.p1;
/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p1
 * @name Rifle
 * @class com.sco.design.lsp.p1.Rifle
 * @date Nov 29, 2014 11:25:49 AM
 * @see
 */
public class Rifle extends AbstractGun{
	// 步枪的特点是射程远，威力大
	@Override
	public void shoot() {
		System.out.println("步枪射击……");
	}

}
