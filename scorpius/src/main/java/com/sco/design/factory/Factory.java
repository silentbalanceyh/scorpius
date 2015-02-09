package com.sco.design.factory;

public class Factory {
	public static void main(String args[]){
		I a = F.get(1);
		I b = F.get(2);
	}
}

interface I{}

class A implements I{
	
}

class B implements I{
	
}

class C implements I{
	
}

class F{
	
	public static I get(int type){
		I ret = null;
		switch(type){
		case 1:ret = new A();break;
		case 2:ret = new B();break;
		case 3:ret = new C();break;
		}
		return ret;
	}
}