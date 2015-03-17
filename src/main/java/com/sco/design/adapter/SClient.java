package com.sco.design.adapter;

public class SClient {
	public static void main(String args[]){
		SAdaptee adaptee = new SAdaptee();
		STarget target = new SAdapter(adaptee);
		target.request();
	}
}
