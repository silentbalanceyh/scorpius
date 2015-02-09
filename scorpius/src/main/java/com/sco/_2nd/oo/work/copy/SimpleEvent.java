package com.sco._2nd.oo.work.copy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleEvent {
	public static void main(String args[]){
		JButton button = new JButton("Close");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evert){
				System.exit(0);
			}
		});
		
		JFrame frame = new JFrame();
		frame.add(button);
		
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
