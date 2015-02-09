package com.sco._2nd.oo.classes.str;

import java.lang.reflect.Field;

public class MyClass {
	String hello = "hi";
	
	int i = 0;
	
	@SuppressWarnings({ "rawtypes" })
	public String toString(){
		StringBuilder sb = new StringBuilder();
		Class cls = getClass();
		Field[] f = cls.getDeclaredFields();
		
		for( int i = 0; i < f.length; i++ ){
			f[i].setAccessible(true);
			try{
				sb.append(f[i].getName() + "=" + f[i].get(this) + "\n");
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		if(cls.getSuperclass().getSuperclass() != null ){
			sb.append("super:" + super.toString() + "\n");
		}
		return cls.getName() + "\n" + sb.toString();
	}
	
	public static void main(String args[]){
		System.out.println(new MyClass().toString());
	}
}
