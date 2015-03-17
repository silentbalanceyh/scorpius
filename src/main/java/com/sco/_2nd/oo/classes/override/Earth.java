package com.sco._2nd.oo.classes.override;

public class Earth extends Planet{
	public static void hide(){
		System.out.println("The hide method in Earth.");
	}
	
	public void override(){
		System.out.println("The override method in Earth.");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String args[]){
		Earth myEarth = new Earth();
		Planet myPlanet = (Planet)myEarth;
		myPlanet.hide();
		myPlanet.override();
	}
}

class Planet{
	public static void hide(){
		System.out.println("The hide method in Planet.");
	}
	
	public void override(){
		System.out.println("The override method in Planet.");
	}
}
