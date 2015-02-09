package com.sco.design.builder;

public class N1Client {
	public static void main(String args[]){
		N1ConcreteBuilder builder = new N1ConcreteBuilder("001",12345L,67890L);
		
		N1InsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build();
		
		contract.someOperation();
	}
}
