package com.sco._2nd.oo.classes.finalclass;

class Peopet{
	@SuppressWarnings("unused")
	private int i;
	
	Peopet(int ii){
		i = ii;
	}
}

public class BlankFinal {
	@SuppressWarnings("unused")
	private final int i = 0;
	
	@SuppressWarnings("unused")
	private final int j;
	
	@SuppressWarnings("unused")
	private final Peopet peopet;
	
	public BlankFinal(){
		j = 1;
		peopet = new Peopet(1);
	}
	
	public BlankFinal(int x){
		j = x;
		peopet = new Peopet(x);
	}
	
	public static void main(String args[]){
		new BlankFinal();
		new BlankFinal(47);
	}
}
