package com.sco.design.prototype;

public class OOrderBusiness {
	public void saveOrder(OOrderApi order){
		while(order.getOrderProductNum() > 1000){
			OOrderApi newOrder = null;
			if( order instanceof OPersonalOrder){
				OPersonalOrder p2 = new OPersonalOrder();
				OPersonalOrder p1 = (OPersonalOrder)order;
				p2.setCustomerName(p1.getCustomerName());
				p2.setProductId(p1.getProductId());
				p2.setOrderProductNum(1000);
				newOrder = p2;
			}else{
				OEnterpriseOrder e2 = new OEnterpriseOrder();
				OEnterpriseOrder e1 = (OEnterpriseOrder)order;
				e2.setEnterpriseName(e1.getEnterpriseName());
				e2.setOrderProductNum(1000);
				e2.setProductId(e1.getProductId());
				newOrder = e2;
			}
			
			order.setOrderProductNum(order.getOrderProductNum() - 1000);
			System.out.println("拆分生成订单==" + newOrder);
		}
		System.out.println("订单==" + order);
	}
}
