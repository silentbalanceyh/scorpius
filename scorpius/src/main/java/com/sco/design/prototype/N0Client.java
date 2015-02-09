package com.sco.design.prototype;

public class N0Client {
	public static void main(String args[]){
		N0OrderApi oal = new N0PersonalOrder();
		oal.setOrderProductNum(100);
		System.out.println("这是第一次获取的对象实例==" + oal.getOrderProductNum());
		
		N0OrderApi oa2 = (N0OrderApi)oal.cloneOrder();
		
		oa2.setOrderProductNum(80);
		System.out.println("输出克隆对象的实例==" + oa2.getOrderProductNum());
		
		System.out.println("再次输入原型实例==" + oal.getOrderProductNum());
	}
}
