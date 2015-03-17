package com.sco.design.factory.abs;

public class OClient {
	public static void main(String args[]){
		OComputerEngineer engineer = new OComputerEngineer();
		
		engineer.makComputer(1, 1);
	}
}
