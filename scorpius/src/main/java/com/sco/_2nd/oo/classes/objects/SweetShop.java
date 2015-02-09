package com.sco._2nd.oo.classes.objects;


class Candy{
	static{
		System.out.println("Loading Candy");
	}
}

class Gum{
	static{
		System.out.println("Loading Gum");
	}
}

class Cookie{
	static{
		System.out.println("Loading Cookie");
	}
}

public class SweetShop {
	public static void main(String args[]){
		System.out.println("Inside main");
		new Candy();
		System.out.println("After creating Candy");
		try{
			Class.forName("com.sco._2nd.oo.classes.objects.Gum");
		}catch( ClassNotFoundException ex){
			System.out.println("Couldn't find Gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}
}
