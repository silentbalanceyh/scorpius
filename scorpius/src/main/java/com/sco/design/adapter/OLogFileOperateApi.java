package com.sco.design.adapter;

import java.util.List;

public interface OLogFileOperateApi {
	public List<OLogModel> readLogFile();
	
	public void writeLogFile(List<OLogModel> list);
}
