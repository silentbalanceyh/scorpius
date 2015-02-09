package com.sco.design.prototype;

public class N2PersonalOrder implements N0OrderApi{

	private String customerName;
	
	private N2Product product;
	
	public N2Product getProduct() {
		return product;
	}

	public void setProduct(N2Product product) {
		this.product = product;
	}

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
				+ ", 订购的产品是=" + this.product.getName() + ", 订购数量是="
				+ orderProductNum + "]";
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public N0OrderApi cloneOrder(){
		N2PersonalOrder order = new N2PersonalOrder();
		order.setCustomerName(this.customerName);
		order.setOrderProductNum(this.orderProductNum);
		order.setProduct((N2Product)this.product.cloneProduct());
		return order;
	}
}
