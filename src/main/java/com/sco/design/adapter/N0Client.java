package com.sco.design.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class N0Client {
	public static void main(String args[]){
		OLogModel m = new OLogModel();
		m.setLogId("002");
		m.setOperateUser("admin1");
		m.setOperateTime(new Date().toString());
		m.setLogContent("这是一个适配器的测试");
		
		List<OLogModel> list = new ArrayList<OLogModel>();
		list.add(m);
		
		OLogFileOperateApi logFileApi = new OLogFileOperate("");
		
		OLogDbOperateApi api = new N0Adapter(logFileApi);
		
		api.createLog(m);
		
		List<OLogModel> allLog = api.getAllLog();
		System.out.println("allLog=" + allLog);
	}
}
