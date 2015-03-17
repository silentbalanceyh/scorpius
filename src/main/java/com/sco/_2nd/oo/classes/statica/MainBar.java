package com.sco._2nd.oo.classes.statica;

public class MainBar {
	static Bar bar;
	
	static{
		try{
			bar = new Bar();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		System.out.println(bar);
	}
}

class Bar{
	public Bar() throws Exception{}
	
	public String toString(){
		return "Bar";
	}
}
