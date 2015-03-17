package com.sco.design.prototype;

public class N2Client {
	public static void main(String args[]){
		N2PersonalOrder oal = new N2PersonalOrder();
		N2Product product = new N2Product();
		
		product.setName("产品1");
		oal.setProduct(product);
		oal.setOrderProductNum(100);
		
		System.out.println("这是第一次获取的对象实例=" + oal);
		
		N2PersonalOrder oa2 = (N2PersonalOrder)oal.cloneOrder();
		oa2.getProduct().setName("产品2");
		oa2.setOrderProductNum(80);
		
		System.out.println("输出克隆出来的实例=" + oa2);
		
		System.out.println("再次输出原型实例=" + oal);
	}
}
