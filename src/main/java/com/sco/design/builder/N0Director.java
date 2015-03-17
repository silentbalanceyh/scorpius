package com.sco.design.builder;

import java.util.Collection;
import java.util.Map;

public class N0Director {
	private N0Builder builder;
	
	public N0Director(N0Builder builder){
		this.builder = builder;
	}
	
	public void construct(OExportHeaderModel ehm,
			Map<String,Collection<OExportDataModel>> mapData,
			OExportFooterModel efm){
		builder.buildFooter(efm);
		
		builder.buildBody(mapData);
		
		builder.buildFooter(efm);
	}
}
