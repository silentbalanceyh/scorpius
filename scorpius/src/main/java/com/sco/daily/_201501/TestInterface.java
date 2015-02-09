package com.sco.daily._201501;

public class TestInterface {
	public static void main(String args[]){
		
	}

}

/*
 * 系统自动附加：
 * 接口 -> 抽象：abstract
 * 变量 -> 常量：public static final
 * 方法 -> 抽象方法：abstract
 */
interface InterfaceA{
	int intValue = 0;
	public void MethodOne();
}

//必须继承抽象方法
//class ExtendInterfaceOne implements InterfaceA{}
class ExtendInterfaceOne implements InterfaceA{
	//	final常量不能重新赋值
	//	intValue = 1;
	public void MethodOne(){
		int intTemp = 0;
		if(intValue == intTemp){
			System.out.println("ExtendInterfaceOne -- MethodOne");
		}else{
			System.out.println("ExtendInterfaceOne -- Error");
		}
	}
}