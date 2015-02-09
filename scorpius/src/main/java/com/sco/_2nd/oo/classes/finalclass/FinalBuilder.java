package com.sco._2nd.oo.classes.finalclass;

public class FinalBuilder {
	public static void main(String args[]){
		@SuppressWarnings("unused")
		StringBuilder builder = new StringBuilder("World");
		//String builderStr = new String("World");
		//print(builder,"");
//		System.out.println(builder);
//		System.out.println("----");
//		builder = null;
//		System.out.println(builder);
//		builder.append(true);
		A a = new A("A");
		A b = new A("A");
		System.out.println(a.equals(b));
		//System.out.println(builderStr);
	}
}

class A{
	public String name;
	public A(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o){
		if( o instanceof A){
			if(((A)o).name.equals(this.name))
			{
				return true;
			}
		}
		return false;
	}
}
