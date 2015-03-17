package com.sco.design.facade;

public class OClient {
	public static void main(String args[]){
		new OPresentation().generate();
		new OBusiness().generate();
		new ODAO().generate();
	}
}
