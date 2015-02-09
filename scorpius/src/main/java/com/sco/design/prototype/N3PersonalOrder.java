package com.sco.design.prototype;

public class N3PersonalOrder implements Cloneable,N1OrderApi{

	private String customerName;
	
	private N3Product product;
	
	public N3Product getProduct() {
		return product;
	}

	public void setProduct(N3Product product) {
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
	
	public Object clone(){
		N3PersonalOrder obj = null;
		try{
			obj = (N3PersonalOrder)super.clone();
			// 深度克隆此句必不可少
			obj.setProduct((N3Product)this.product.clone());
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return obj;
	}
}
