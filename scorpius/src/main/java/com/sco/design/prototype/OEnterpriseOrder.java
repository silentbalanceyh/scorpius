package com.sco.design.prototype;

public class OEnterpriseOrder implements OOrderApi{
	
	private String enterpriseName;
	
	private String productId;
	
	private int orderProductNum = 0;

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getOrderProductNum() {
		return orderProductNum;
	}

	public void setOrderProductNum(int orderProductNum) {
		this.orderProductNum = orderProductNum;
	}
	
	@Override
	public String toString(){
		return "本企业订单的订购企业是=" + this.enterpriseName + 
			"，订购的产品是=" + this.productId + 
			", 订购数量为=" + this.orderProductNum;
	}
}
