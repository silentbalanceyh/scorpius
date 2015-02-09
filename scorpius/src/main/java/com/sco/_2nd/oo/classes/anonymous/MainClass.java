package com.sco._2nd.oo.classes.anonymous;

public class MainClass {
	public static void main(String[] args){
		Ball ball = new Ball(){
			public void hit(){
				System.out.println("You hit it!");
			}
		};
		ball.hit();
	}
	
	interface Ball{
		void hit();
	}
}
