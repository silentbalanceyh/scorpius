package com.sco.design.factory.abs;

public class OMainboardFactory {
	public static OMainboardApi createMainboardApi(int type){
		OMainboardApi mainboard = null;
		if( type == 1 ){
			mainboard = new OGAMainboard(1156);
		}else if( type == 2 ){
			mainboard = new OMSIMainboard(939);
		}
		return mainboard;
	}
}
