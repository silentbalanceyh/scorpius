package com.sco.design.prototype;

public class N3Product implements Cloneable{
	private String productId;
	
	private String name;
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "产品编号=" + this.productId + ",产品名称=" + this.name;
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
