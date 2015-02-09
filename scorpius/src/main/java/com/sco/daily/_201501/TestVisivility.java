package com.sco.daily._201501;

public class TestVisivility {
	final int intValue = 10;
	public void Visivility(){
		
		for(int intValue = 0; intValue < 15; intValue++ ){
			System.out.print(intValue + " ");
		}
		System.out.println("\n" + intValue);
	}
	public static void main(String args[]){
		TestVisivility objVisibility = new TestVisivility();
		objVisibility.Visivility();
	}

}
