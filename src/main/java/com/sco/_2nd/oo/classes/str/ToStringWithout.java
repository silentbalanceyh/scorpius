package com.sco._2nd.oo.classes.str;


public class ToStringWithout {
	int x,y;
	public ToStringWithout(int anx,int ay){
		x = anx; y = ay;
	}
	
	public static void main(String args[]){
		System.out.println(new ToStringWithout(42,86));
	}
}
