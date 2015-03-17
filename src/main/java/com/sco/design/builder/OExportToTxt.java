package com.sco.design.builder;

import java.util.Collection;
import java.util.Map;

public class OExportToTxt {
	public void export(OExportHeaderModel ehm,
			Map<String,Collection<OExportDataModel>> mapData,
			OExportFooterModel efm){
		StringBuffer buffer = new StringBuffer();
		buffer.append(ehm.getDeptId() + "," + ehm.getExportData() + "\n");
		
		for( String tblName: mapData.keySet()){
			buffer.append(tblName + "\n");
			for( OExportDataModel edm: mapData.get(tblName)){
				buffer.append(edm.getProductId() + "," + edm.getPrice()
						+ "," + edm.getAmount() + "\n");
			}
		}
		
		buffer.append(efm.getExportUser());
		
		System.out.println("输出到文本内容：\n" + buffer);
	}
}
