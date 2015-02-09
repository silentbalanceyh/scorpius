package com.sco.design.builder;

import java.util.Collection;
import java.util.Map;

public interface N0Builder {
	public void buildHeader(OExportHeaderModel ehm);
	
	public void buildBody(Map<String,Collection<OExportDataModel>> mapData);
	
	public void buildFooter(OExportFooterModel efm);
}
