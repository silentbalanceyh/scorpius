package com.sco.design.prototype;

public class N0OrderBusiness {
	public void saveOrder(N0OrderApi order){
		while(order.getOrderProductNum() > 1000){
			N0OrderApi newOrder = order.cloneOrder();
			newOrder.setOrderProductNum(1000);
			order.setOrderProductNum(order.getOrderProductNum() - 1000);
			System.out.println("拆分生成订单==" + newOrder);
		}
		System.out.println("订单==" + order);
	}
}
