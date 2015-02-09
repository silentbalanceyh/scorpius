package com.sco.daily._201501;

import java.awt.Point;

public class TestByValueByRef {
	public static void modifyPoint(Point pt, int i){
		pt.setLocation(5,5);
		i = 10;
		System.out.println("Modify Point: pt = " + pt + " and i = " + i);
	}
	public static void main(String args[]){
		Point pt = new Point(0,0);
		int i = 20;
		System.out.println("Point: pt = " + pt + " and i = " + i);
		modifyPoint(pt, i);
		System.out.println("After Modify Point: pt = " + pt + " and i = " + i);
	}

}
