package com.sco.design.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OClient {
	public static void main(String args[]){
		OLogModel m = new OLogModel();
		m.setLogId("001");
		m.setOperateUser("admin");
		m.setOperateTime(new Date().toString());
		m.setLogContent("这是一个测试");
		
		List<OLogModel> list = new ArrayList<OLogModel>();
		list.add(m);
		
		OLogFileOperateApi api = new OLogFileOperate("");
		api.writeLogFile(list);
		List<OLogModel> readLog = api.readLogFile();
		System.out.println("readLog=" + readLog);
	}
}
