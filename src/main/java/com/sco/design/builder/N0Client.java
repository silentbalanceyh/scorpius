package com.sco.design.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class N0Client {
	public static void main(String args[]) {
		OExportHeaderModel ehm = new OExportHeaderModel();
		ehm.setDeptId("一分公司");
		ehm.setExportData("2010-05-18");

		Map<String, Collection<OExportDataModel>> mapData = new HashMap<String, Collection<OExportDataModel>>();

		Collection<OExportDataModel> col = new ArrayList<OExportDataModel>();
		OExportDataModel edm1 = new OExportDataModel();
		edm1.setProductId("产品001号");
		edm1.setPrice(100);
		edm1.setAmount(80);

		OExportDataModel edm2 = new OExportDataModel();
		edm2.setProductId("产品002号");
		edm2.setPrice(99);
		edm2.setAmount(55);

		col.add(edm1);
		col.add(edm2);
		mapData.put("销售记录表", col);

		OExportFooterModel efm = new OExportFooterModel();
		efm.setExportUser("张三");

		N0TxtBuilder txtBuilder = new N0TxtBuilder();
		N0Director director = new N0Director(txtBuilder);

		director.construct(ehm, mapData, efm);

		System.out.println("输出到文本文件的内容：" + txtBuilder.getResult());

		N0XmlBuilder xmlBuilder = new N0XmlBuilder();
		N0Director director2 = new N0Director(xmlBuilder);

		director2.construct(ehm, mapData, efm);

		System.out.println("输出到文本文件的内容：" + xmlBuilder.getResult());
	}
}
