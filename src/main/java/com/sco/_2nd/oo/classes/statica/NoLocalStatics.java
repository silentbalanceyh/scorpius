package com.sco._2nd.oo.classes.statica;

public class NoLocalStatics {
	
	public static void main(String args[]){
		NoLocalStatics t = new NoLocalStatics();
		t.process();
	}
	
	void process(){
		/// static int a = 42;
		int a = 42;
		System.out.println("Process:" + a);
	}

}
