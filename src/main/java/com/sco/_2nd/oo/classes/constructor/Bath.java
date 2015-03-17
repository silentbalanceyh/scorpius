package com.sco._2nd.oo.classes.constructor;

class Soap{
	private String s;
	
	Soap(){
		System.out.println("Soap()");
		s = new String("Constructed");
	}
	
	public String toString(){
		return s;
	}
}

public class Bath {
	private String s1 = new String("Happy"), s2 = "Happy", s3,s4;
	
	private Soap castilleSoap;
	
	private int i;
	
	private float toy;
	
	public Bath(){
		System.out.println("Inside Bath()");
		s3 = new String("Joy");
		i = 47;
		toy = 3.14f;
		castilleSoap = new Soap();
	}
	
	public String toString(){
		if( s4 == null)
			s4 = new String("Joy");
		return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n"
			+ "s4 = " + s4 + "\n" + "i = " + i + "\n" + "toy = " + toy + 
			"\n" + "castille = "+ castilleSoap;
	}
	
	public static void main(String args[]){
		Bath b = new Bath();
		System.out.println(b);
	}
}
