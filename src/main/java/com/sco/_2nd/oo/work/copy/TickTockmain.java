package com.sco._2nd.oo.work.copy;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockmain {
	private String tickMessage = "Tick...";
	private String tockMessage = "Tock...";
	
	public static void main(String args[]){
		TickTockmain tickTockMain = new TickTockmain();
		tickTockMain.go();
	}
	private void go() {
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
		JOptionPane.showMessageDialog(null, "Click OK to exit program");
		System.exit(0);
	}
	

}
