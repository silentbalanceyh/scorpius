package com.sco.daily._201501;
import static java.lang.System.out;
public class TestTypeConversionWithExtends {
	public static void main(String args[]){
		// 接口回调: 可把实现了某一个接口的类创建的对象的引用赋给该接口声明的接口变量
		@SuppressWarnings("unused")
		InterfaceAA a = new ClassC4();
		@SuppressWarnings("unused")
		InterfaceB b = new ClassB1();
		@SuppressWarnings("unused")
		InterfaceC c = new ClassC1();
		
		//向上转型
		@SuppressWarnings("unused")
		ClassB1 b1= new ClassB2();
		ClassC1 c1 = new ClassC4();
		ClassC1 c2 = new ClassC2();
		c1 = c2;
		
		//向下转型
		c2 = (ClassC1) c1;
	//	c1 = (ClassB1) b1;
		out.println("test");
	}

}

interface InterfaceAA{}
interface InterfaceB extends InterfaceAA{}
class ClassB1 implements InterfaceB{}
class ClassB2 extends ClassB1{}
class ClassB3 extends ClassB1{}

interface InterfaceC{}
class ClassC1 extends ClassB2 implements InterfaceC{}
class ClassC2 extends ClassC1{}
class ClassC3 extends ClassC1{}
class ClassC4 extends ClassC2{}






