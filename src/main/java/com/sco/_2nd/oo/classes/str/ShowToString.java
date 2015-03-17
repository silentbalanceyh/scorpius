package com.sco._2nd.oo.classes.str;

import java.awt.Button;
import java.util.Date;
import java.util.GregorianCalendar;

public class ShowToString {
	
	public static void main(String args[]){
		System.out.println("An Object\n" + new Object());
		System.out.println("A Date \n" + new Date());
		System.out.println("A GregorianCalendar\n" + new GregorianCalendar());
		System.out.println("An Exception\t" + new Exception("Hi!"));
		Button button = new Button("Push ME!");
		button.setBounds(40,50,120,60);
		System.out.println("A Button\n" + button);
		System.out.println("A ShowToString object!\n" + new ShowToString());
	}
}
