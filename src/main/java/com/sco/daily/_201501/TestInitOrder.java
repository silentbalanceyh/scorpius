package com.sco.daily._201501;

public class TestInitOrder{
	/*
	 * 父类 -> 子类
	 * 静态 -> 成员
	 * 静态： 静态函数 -> 静态变量 -> 静态块
	 * 成员： 成员函数 -> 成员变量 -> 构造函数
	 */
	public static void main(String args[]){
		new ExtendClass2();
	}
}

/*
 * BaseClass: 父类，基本类
 * 			  包括：静态变量，成员变量，静态块，构造函数
 */
class BaseClass{
	public static String strA = "BaseClass";
	public int intB = 2;
	public static String strB = getClassStaticMethod();
	static{
		System.out.println("This Class is " + strA);
		System.out.println("Test Order: static segment and static Method");
	}
	public BaseClass(){
		System.out.println("Init intB (BaseClass): " + intB);
	}
	private static String getClassStaticMethod() {
		System.out.println("BaseClass Static Method: getClassStaticMethod");
		return "BaseClass";
	}
}

/*
 * ExtendClass1: 子类，继承于类BaseClass
 * 				静态变量，成员函数，成员变量，静态块，构造函数
 */
class ExtendClass1 extends BaseClass{
	public static String strA = getClassStaticMethod();
	public int intB = getClassInstanceMethod();
	static{
		System.out.println("This Class is " + strA);
	}
	public ExtendClass1(){
		System.out.println("Init intB (ExtendClass1): " + intB);
	}
	
	public static String getClassStaticMethod(){
		System.out.println("ExtendClass1 Static Method getClassStaticMethod");
		return "ExtendClass";
	}
	public int getClassInstanceMethod() {
		System.out.println("ExtendClass1 Instance Method getClassInstanceMethod");
		return 20;
	};
}

/*
 * ExtendClass2: 子类，继承于类BaseClass
 * 				静态变量，成员函数，成员变量，静态块，构造函数
 */
class ExtendClass2 extends ExtendClass1{
	public static String strA = "(Extend)" + getClassStaticMethod();
	public static String strB = getStaticMethod();
	public int intB = getInstanceMethod();
	static{
		System.out.println("This class is " + strA);
		System.out.println("This class is " + strB);
	}
	private static String getStaticMethod() {
		System.out.println("ExtendClass2 Static Method getStaticMethod");
		return "ExtendClass2";
	}
	private int getInstanceMethod() {
		System.out.println("ExtendClass2 Instance Method getInstanceMethod");
		return 200;
	}
	
	public ExtendClass2(){
		System.out.println("Init intB (ExtendClass2):" + intB);
	}
	
}

