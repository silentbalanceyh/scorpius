package com.sco.design.builder;

import java.util.Collection;
import java.util.Map;

public class N0TxtBuilder implements N0Builder{
	private StringBuffer buffer = new StringBuffer();

	public void buildBody(Map<String, Collection<OExportDataModel>> mapData) {
		for( String tblName: mapData.keySet()){
			buffer.append(tblName + "\n");
			for( OExportDataModel edm: mapData.get(tblName)){
				buffer.append(edm.getProductId() + "," + edm.getPrice()
						+ "," + edm.getAmount() + "\n");
			}
		}
	}

	public void buildFooter(OExportFooterModel efm) {
		buffer.append(efm.getExportUser());
	}

	public void buildHeader(OExportHeaderModel ehm) {
		buffer.append(ehm.getDeptId() + "," + ehm.getExportData() + "\n");
	}
	
	public StringBuffer getResult(){
		return buffer;
	}
}
