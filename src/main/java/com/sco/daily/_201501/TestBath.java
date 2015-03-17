package com.sco.daily._201501;

public class TestBath {
	private String str1 = new String("TestBath - Str1"), str2 = "TestBath - str2", str3, str4;
	
	private Soap objSoap;
	private int i;
	private float toy;
	
	public TestBath(){
		System.out.println("class TestBath - TestBath()");
		str3 = new String("TestBath - str3");
		i = 47;
		toy = 3.31415926f;
		objSoap = new Soap();

	}
	public String toString(){
		if(str4 == null){
			str4 = new String("TestBath - str4");
		}
		return "str1 = " + str1 + "\nstr2 = " + str2 + "\nstr3 = " + str3 +
				"\nstr4 = " + str4 + "\ni = " + i + "\ntoy = " + toy + 
				"\nobjSoap = " + objSoap;
	}
	
	public static void main(String args[]){
		TestBath objObject = new TestBath();
		System.out.println(objObject);
	}
	
}

class Soap{
	private String strString;
	public Soap(){
		System.out.println("Class Soap - Soap()");
		strString = new String("Constructed");
	}
	public String toString(){
		return strString;
	}
}




