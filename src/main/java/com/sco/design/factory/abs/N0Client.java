package com.sco.design.factory.abs;

public class N0Client {
	public static void main(String args[]){
		N0ComputerEngineer engineer = new N0ComputerEngineer();
		N0AbstractFactory schema = new N0Schema1();
		engineer.makComputer(schema);
	}
}
