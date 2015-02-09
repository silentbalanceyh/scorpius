package com.sco.daily._201501;

public class TestClone {
	public static void main(String args[]){
		System.out.println("----------------------Clone()---------------------------");
		AClone objAClone1 = new AClone();
		objAClone1.intA = 10;
		AClone objAClone2 = (AClone)objAClone1.clone();
		System.out.println(objAClone1.intA);
		System.out.println(objAClone2.intA);
		System.out.println(objAClone1 == objAClone2);
		
		System.out.println("\n----------------------浅拷贝---------------------------");
		BClone objBClone1 = new BClone();
		System.out.println(objBClone1.intA);
		System.out.println(objBClone1.objAClass);
		
		System.out.println("\n 更改基本类型成员变量的值");
		objBClone1.intA = 15;
		System.out.println(objBClone1.intA);
		System.out.println(objBClone1.objAClass);
		
		System.out.println("\n clone对象，不更改基本类型成员变量的值，调用ChangeValue()");
		BClone objBClone2 = (BClone)objBClone1.clone();
		objBClone2.objAClass.ChangeValue();
		System.out.println("objBCLone1: " + objBClone1.intA);
		System.out.println("objBCLone1: " + objBClone1.objAClass);
		System.out.println("objBCLone2: " + objBClone2.intA);
		System.out.println("objBCLone2: " + objBClone2.objAClass);
		
		System.out.println("\n 更改基本类型成员变量的值，不调用ChangeValue()");
		objBClone2.intA = 16;
		System.out.println("objBCLone1: " + objBClone1.intA);
		System.out.println("objBCLone1: " + objBClone1.objAClass);
		System.out.println("objBCLone2: " + objBClone2.intA);
		System.out.println("objBCLone2: " + objBClone2.objAClass);
		
		System.out.println("\n 更改基本类型成员变量的值，调用ChangeValue()");
		objBClone2.intA = 17;
		objBClone2.objAClass.ChangeValue();
		System.out.println("objBCLone1: " + objBClone1.intA);
		System.out.println("objBCLone1: " + objBClone1.objAClass);
		System.out.println("objBCLone2: " + objBClone2.intA);
		System.out.println("objBCLone2: " + objBClone2.objAClass);
		
		System.out.println("\n----------------------深拷贝---------------------------");
		CClone objCClone1 = new CClone();
		System.out.println(objCClone1.intA);
		System.out.println(objCClone1.objAClass);
		
		System.out.println("\n 更改基本类型成员变量的值");
		objCClone1.intA = 15;
		System.out.println(objCClone1.intA);
		System.out.println(objCClone1.objAClass);
		
		System.out.println("\n clone对象，不更改基本类型成员变量的值，调用ChangeValue()");
		CClone objCClone2 = (CClone)objCClone1.clone();
		objCClone2.objAClass.ChangeValue();
		System.out.println("objCClone1: " + objCClone1.intA);
		System.out.println("objCClone1: " + objCClone1.objAClass);
		System.out.println("objCCLone2: " + objCClone2.intA);
		System.out.println("objCCLone2: " + objCClone2.objAClass);
		
		System.out.println("\n 更改基本类型成员变量的值，不调用ChangeValue()");
		objCClone2.intA = 16;
		System.out.println("objCClone1: " + objCClone1.intA);
		System.out.println("objCClone1: " + objCClone1.objAClass);
		System.out.println("objBCLone2: " + objCClone2.intA);
		System.out.println("objBCLone2: " + objCClone2.objAClass);
		
		System.out.println("\n 更改基本类型成员变量的值，调用ChangeValue()");
		objCClone2.intA = 17;
		objCClone2.objAClass.ChangeValue();
		System.out.println("objCClone1: " + objCClone1.intA);
		System.out.println("objCClone1: " + objCClone1.objAClass);
		System.out.println("objCCLone2: " + objCClone2.intA);
		System.out.println("objCCLone2: " + objCClone2.objAClass);
	}
}

/*
 * Clone()
 */
class AClone implements Cloneable{
	public int intA = 10;
	public Object clone(){
		AClone objA = null;
		try{
			objA = (AClone)super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return objA;
	}
}

class AClass{
	int intA;
	AClass(int intA){
		this.intA = intA;
	}
	void ChangeValue(){
		intA += 12;
	}
	public String toString(){
		return "IntA is " + this.intA;
	}
}
/*
 * 浅拷贝，只拷贝基本数据类型的成员变量，不拷贝复杂的类型的成员变量
 */
class BClone implements Cloneable{
	int intA = 12;
	AClass objAClass = new AClass(11);
	public Object clone(){
		BClone objBClone = null;
		try{
			objBClone = (BClone)super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return objBClone;
	}
}
/*
 * 深克隆
 */
class AClass1 implements Cloneable{
	int intA;
	AClass1(int intA){
		this.intA = intA;
	}
	void ChangeValue(){
		intA += 12;
	}
	public String toString(){
		return "IntA is " + this.intA;
	}
	public Object clone(){
		AClass1 objAClass1 = null;
		try{
			objAClass1 = (AClass1)super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return objAClass1;
	}
}
class CClone implements Cloneable{
	int intA = 13;
	AClass1 objAClass = new AClass1(11);
	public Object clone(){
		CClone objCClone = null;
		try{
			objCClone = (CClone)super.clone();
			objCClone.objAClass = (AClass1)objAClass.clone();			
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return objCClone;
	} 
}



