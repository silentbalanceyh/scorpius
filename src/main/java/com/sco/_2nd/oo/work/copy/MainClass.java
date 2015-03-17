package com.sco._2nd.oo.work.copy;

public class MainClass {
	public static void main(String args[]){
		Ball ball = new Ball(){
			public void hit(){
				System.out.println("Interface Ball : hit()");
			}
		};
		ball.hit();
	}
	
	interface Ball{
		void hit();
	}

}
