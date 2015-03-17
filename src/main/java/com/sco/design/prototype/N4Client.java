package com.sco.design.prototype;

public class N4Client {
	public static void main(String args[]){
		try{
			N4Prototype p1 = new N4ConcretePrototype();
			N4PrototypeManager.setPrototype("prototype1", p1);
			
			N4Prototype p3 = N4PrototypeManager.getPrototype("prototype1").clone();
			p3.setName("张三");
			System.out.println("第一个实例：" + p3);
			
			N4Prototype p2 = new N4ConcretePrototype2();
			N4PrototypeManager.setPrototype("prototype2", p2);
			
			N4Prototype p4 = N4PrototypeManager.getPrototype("prototype2").clone();
			p4.setName("李四");
			System.out.println("第二个实例：" + p4);
			
			N4PrototypeManager.removePrototype("prototype1");
			
			N4Prototype p5 = N4PrototypeManager.getPrototype("prototype1").clone();
			p5.setName("王五");
			System.out.println("第三个实例：" + p5);
		}catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}
}
