package com.sco.design.dip.old;
/**
 * 
 * @author Lang
 * @package com.sco.design.dip.old
 * @name Client
 * @class com.sco.design.dip.old.Client
 * @date Nov 30, 2014 6:14:34 PM
 * @see
 */
public class Client {
	public static void main(String[] args){
		Driver zhangSan = new Driver();
		Benz benz = new Benz();
		// 张三开奔驰
		zhangSan.drive(benz);
	}
}
