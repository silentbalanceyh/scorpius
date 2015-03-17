package com.sco.design.builder;

import java.util.Collection;
import java.util.Map;

public class N0XmlBuilder implements N0Builder{
	
	private StringBuffer buffer = new StringBuffer();
	
	public void buildBody(Map<String, Collection<OExportDataModel>> mapData) {
		buffer.append("<Body>\n");
		for( String tblName: mapData.keySet()){
			buffer.append("<Datas TableName=\"" + tblName + "\">\n");
			for( OExportDataModel edm: mapData.get(tblName)){
				buffer.append("<Data>\n");
				buffer.append("<ProductId>" + edm.getProductId() + "</ProductId>\n");
				buffer.append("<Price>" + edm.getPrice() + "</Price>\n");
				buffer.append("<Amount>" + edm.getAmount() + "</Amount>\n");
				buffer.append("</Data>\n");
			}
			buffer.append("</Datas>\n");
		}
		buffer.append("</Body>\n");
	}

	public void buildFooter(OExportFooterModel efm) {
		buffer.append("<Footer>\n");
		buffer.append("<ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
		buffer.append("</Footer>\n");
		buffer.append("</Report>\n");
	}

	public void buildHeader(OExportHeaderModel ehm) {
		buffer.append("<?xml version='1.0' encoding='gb2312' ?>\n");
		buffer.append("<Report>\n");
		buffer.append("<Header>\n");
		buffer.append("<DepId>" + ehm.getDeptId() + "</DepId>\n");
		buffer.append("<ExportData>" + ehm.getExportData() + "</ExportData>\n");
		buffer.append("</Header>\n");
	}
	
	public StringBuffer getResult(){
		return buffer;
	}

}
