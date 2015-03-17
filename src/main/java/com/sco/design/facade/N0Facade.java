package com.sco.design.facade;

public class N0Facade {
	public void generate(){
		new OPresentation().generate();
		new OBusiness().generate();
		new ODAO().generate();
	}
}
