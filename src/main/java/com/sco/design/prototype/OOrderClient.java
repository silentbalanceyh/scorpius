package com.sco.design.prototype;

public class OOrderClient {
	public static void main(String args[]){
		OPersonalOrder op = new OPersonalOrder();
		op.setOrderProductNum(2925);
		op.setCustomerName("张三");
		op.setProductId("P00001");
		
		OOrderBusiness ob = new OOrderBusiness();
		ob.saveOrder(op);
	}
}
