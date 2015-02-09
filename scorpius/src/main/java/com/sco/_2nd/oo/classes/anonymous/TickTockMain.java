package com.sco._2nd.oo.classes.anonymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class TickTockMain {
	private String tickMessage = "Tick...";
	private String tockMessage = "Tock...";
	
	public static void main(String args[]){
		TickTockMain tickTockMain = new TickTockMain();
		tickTockMain.go();
	}
	
	private void go(){
		Timer timer = new Timer(1000,new ActionListener(){
			private boolean tick = true;
			
			public void actionPerformed(ActionEvent event){
				if(tick){
					System.out.println(tickMessage);
				}else{
					System.out.println(tockMessage);
				}
				tick = !tick;
			}
		});
		timer.start();
		JOptionPane.showMessageDialog(null,"Click Ok to exit program");
		System.exit(0);
	}
}
