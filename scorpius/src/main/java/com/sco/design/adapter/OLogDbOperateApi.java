package com.sco.design.adapter;

import java.util.List;

public interface OLogDbOperateApi {
	public void createLog(OLogModel m);
	public void updateLog(OLogModel m);
	public void removeLog(OLogModel m);
	public List<OLogModel> getAllLog();
}
