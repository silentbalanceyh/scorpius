package com.sco.daily._201501;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;
public class TestTickTock {
	private String strTick = "Hao";
	private String strTock = "Shua";
	public static void main(String args[]){
		TestTickTock objTickTock = new TestTickTock();
		objTickTock.go();
	}
	private void go() {
		// TODO Auto-generated method stub
		Timer timer = new Timer(500, new ActionListener(){
			private boolean tick = true;
			public void actionPerformed(ActionEvent event){
				if(tick){
					System.out.println(strTick);
				}else{
					System.out.println(strTock);
				}
				tick = !tick;
			}
		});
		timer.start();
		JOptionPane.showMessageDialog(null, "Click");
		System.exit(0);
	}
}
