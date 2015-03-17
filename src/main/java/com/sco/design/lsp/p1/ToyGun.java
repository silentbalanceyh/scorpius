package com.sco.design.lsp.p1;
/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p1
 * @name ToyGun
 * @class com.sco.design.lsp.p1.ToyGun
 * @date Nov 29, 2014 11:34:02 AM
 * @see
 */
public class ToyGun extends AbstractGun{
	// 玩具枪是不能射击的，但是编译器又要求实现这个方法，怎么办？虚构一个呗！
	@Override
	public void shoot() {
		// 玩具枪不能射击，这个方法就不实现了
	}
}
