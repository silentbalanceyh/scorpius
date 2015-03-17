package com.sco.design.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class N1Client {
	public static void main(String args[]){
		OLogModel m = new OLogModel();
		m.setLogId("001");
		m.setOperateUser("admin");
		m.setOperateTime(new Date().toString());
		m.setLogContent("这是双向适配器的例子");
		
		List<OLogModel> list = new ArrayList<OLogModel>();
		list.add(m);
		
		OLogFileOperateApi fileLogApi = new OLogFileOperate("");
		OLogDbOperateApi dbLogApi = new N1LogDbOperate();
		
		OLogFileOperateApi fileLogApi2 = new N1TwoDirectAdapter(fileLogApi,dbLogApi);
		
		OLogDbOperateApi dbLogApi2 = new N1TwoDirectAdapter(fileLogApi,dbLogApi);
		
		dbLogApi2.createLog(m);
		List<OLogModel> allLog = dbLogApi2.getAllLog();
		System.out.println("allLog=" + allLog);
		
		fileLogApi2.writeLogFile(list);
		fileLogApi2.readLogFile();
	}
}
