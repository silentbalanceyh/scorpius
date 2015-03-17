package com.sco.design.mediator;

public class N0VideoCard extends N0Colleague{
	public N0VideoCard(N0Mediator mediator) {
		super(mediator);
	}
	
	public void showData(String data){
		System.out.println("你正在观看的是：" + data);
	}
}
