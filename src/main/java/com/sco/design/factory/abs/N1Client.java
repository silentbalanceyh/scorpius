package com.sco.design.factory.abs;

public class N1Client {
	public static void main(String args[]){
		N1ComputerEngineer engineer = new N1ComputerEngineer();
		N1AbstractFactory schema = new N1Schema3();
		engineer.makComputer(schema);
	}
}
