package com.sco._2nd.oo.classes.objects;

import java.util.ArrayList;
import java.util.List;

class IntValue{
	private int n;
	
	public IntValue(int x){
		n = x;
	}
	
	public int getValue(){
		return n;
	}
	
	public void setValue(int n){
		this.n = n;
	}
	
	public void increment(){
		n++;
	}
	
	public String toString(){
		return Integer.toString(n);
	}

}

public class MutableInteger {
	public static void main(String args[]){
		List<IntValue> v = new ArrayList<IntValue>();
		for( int i = 0; i < 10; i++ )
			v.add(new IntValue(i));
		System.out.println(v);
		for(int i = 0; i < v.size(); i++ )
			((IntValue)v.get(i)).increment();
		System.out.println(v);
	}
}
