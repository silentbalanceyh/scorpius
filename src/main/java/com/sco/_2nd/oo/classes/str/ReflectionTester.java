package com.sco._2nd.oo.classes.str;

import java.lang.reflect.Field;

class MineClass{
	int i = 1;
	
	@SuppressWarnings("unused")
	private double d = 3.14;
}

class MyAnotherClass extends MineClass{
	int f = 9;
}

class Util{
	public static String toString(Object object){
		StringBuilder sb = new StringBuilder();
		toString(object,object.getClass(),sb);
		return object.getClass().getName() + "\n" + sb.toString();
	}
	
	@SuppressWarnings("rawtypes")
	private static void toString(Object object,Class clazz,StringBuilder sb){
		Field f[] = clazz.getDeclaredFields();
		
		for( int i = 0; i < f.length; i++ ){
			f[i].setAccessible(true);
			try{
				sb.append(f[i].getName() + "=" + f[i].get(object) + "\n");
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		if( clazz.getSuperclass() != null)
			toString(object,clazz.getSuperclass(),sb);
	}
}

public class ReflectionTester {
	String hello = "world";
	
	int i = 42;
	
	public static void main(String args[]){
		System.out.println(Util.toString(new MineClass()));
		System.out.println(Util.toString(new MyAnotherClass()));
	}
}
