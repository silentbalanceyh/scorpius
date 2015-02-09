package com.sco.daily._201501;

import java.util.EmptyStackException;

public class TestDestroyObject {
	private Object[] elements;
	private int intSize = 0;
	public TestDestroyObject(int intSize){
		this.elements = new Object[intSize];
	}
	public Object pop(){
		if(intSize == 0){
			throw new EmptyStackException();
		}
		/*
		 * 如果不移除，那么可能出现溢出
		 */
		Object objElement = elements[--intSize];
		elements[intSize] = null;
		
	//	return elements[--intSize];
		return objElement;
	}

}
