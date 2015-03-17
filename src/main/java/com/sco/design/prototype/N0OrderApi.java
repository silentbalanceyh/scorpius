package com.sco.design.prototype;

public interface N0OrderApi {
	public int getOrderProductNum();
	public void setOrderProductNum(int num);
	
	public N0OrderApi cloneOrder();
}
