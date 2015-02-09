package com.sco.daily._201501;

/**
 * 
 * @author chexue
 * @see
 */

public class TestAbstractClass {
	public static void main(String args[]){
	//	不可以实例化
	//	AbstractClassOne a = new AbstractClassOne();
		
		System.out.println("\n-----------------类继承抽象类中的抽象方法-------------------\n");
		ExtendAbstractClassOne a = new ExtendAbstractClassOne();
		a.NotOnlyAbstract();
		a.MethodOne();
		a.MethodTwo();
		
		System.out.println("\n-----------------类继承抽象类中的全部方法-------------------\n");
		
		ExtendAbstractClassTwo b = new ExtendAbstractClassTwo();
		b.NotOnlyAbstract();
		b.MethodOne();
		b.MethodTwo();
		
		System.out.println("\n-----------------类继承抽象类(子类)-------------------\n");
	//	不能实例化
	//	AbstractClassTwo c = new AbstractClassTwo();
		ExtendAbstractClassThree c = new ExtendAbstractClassThree();
		c.NotOnlyAbstract();
		c.MethodOne();
		c.MethodTwo();
		
	}

}

/*
 * 抽象类中不一定全是抽象方法
 */
abstract class AbstractClassOne{
	public void NotOnlyAbstract(){
		System.out.println("Not Only Abstract Method.");
	}	
	public abstract void MethodOne();
	abstract void MethodTwo();
}

/*
 * 类继承抽象类中的抽象方法
 */
class ExtendAbstractClassOne extends AbstractClassOne{
	public void MethodOne(){
		System.out.println("ExtendAbstractClassOne - Method One.");
	}
	public void MethodTwo(){
		System.out.println("ExtendAbstractClassOne - Method Two.");
	}
}

/*
 * 类继承抽象类, 继承全部方法
 */
class ExtendAbstractClassTwo extends AbstractClassOne{
	public void NotOnlyAbstract(){
		System.out.println("ExtendAbstractClassTwo - Not Only Abstract Method.");
	}
	public void MethodOne(){
		System.out.println("ExtendAbstractClassTwo - Method One.");
	}
	public void MethodTwo(){
		System.out.println("ExtendAbstractClassTwo - Method Two.");
	}
}

/*
 * 抽象类继承抽象类的部分抽象方法
 */
abstract class AbstractClassTwo extends AbstractClassOne{
	public void MethodOne(){
		System.out.println("AbstractClassTwo - Method One.");
	}
	
}
/*
 * 类继承抽象类(子类)
 */
class ExtendAbstractClassThree extends AbstractClassTwo{
	public void MethodTwo(){
		System.out.println("ExtendAbstractClassThree - Method Two.");
	}
	
}


