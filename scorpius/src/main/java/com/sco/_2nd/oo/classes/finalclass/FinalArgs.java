package com.sco._2nd.oo.classes.finalclass;

import java.util.Calendar;

public class FinalArgs {
	
	public static void main(String args[]){
		new FinalArgs().run();
	}
	
	void run(){
		System.out.println("Hummm de dummm...");
		myFunc(Calendar.getInstance());
		System.out.println("Once upon a time...");
	}
	
	void myFunc(final Calendar d){
		d.set(Calendar.YEAR, 1999);
	}
}
