package com.sco.design.dip.newest;
/**
 * 
 * @author Lang
 * @package com.sco.design.dip.newest
 * @name Client
 * @class com.sco.design.dip.newest.Client
 * @date Nov 30, 2014 7:51:54 PM
 * @see
 */
public class Client {

	public static void main(String[] args) {
		IDriver zhangSan = new Driver();
		ICar benz = new Benz();
		// ICar bmw = new BMW(); 张三开宝马
		// 张三开奔驰
		zhangSan.drive(benz);
	}
}
