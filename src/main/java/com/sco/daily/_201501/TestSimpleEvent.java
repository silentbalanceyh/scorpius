package com.sco.daily._201501;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestSimpleEvent {
	public static void main(String args[]){
		JButton btnButton = new JButton("Smile");

		btnButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		
		JFrame frmFrame = new JFrame();
		frmFrame.add(btnButton);
		frmFrame.setSize(100, 100);
		frmFrame.setDefaultCloseOperation(0);
		frmFrame.setVisible(true);
	}

}
