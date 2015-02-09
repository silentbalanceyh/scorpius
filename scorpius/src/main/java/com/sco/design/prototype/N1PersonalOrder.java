package com.sco.design.prototype;

public class N1PersonalOrder implements Cloneable,N1OrderApi{

	private String customerName;
	
	private String productId;
	
	private int orderProductNum = 0;

	public int getOrderProductNum() {
		return this.orderProductNum;
	}

	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}

	@Override
	public String toString() {
		return "本个人订单的订购人是=" + customerName
				+ ", 订购的产品是=" + productId + ", 订购数量是="
				+ orderProductNum + "]";
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public Object clone(){
		Object obj = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return obj;
	}
}
