package com.sco.design.adapter;

import java.util.List;

public class N1LogDbOperate implements OLogDbOperateApi{

	public void createLog(OLogModel m) {
		System.out.println("New in LogDbOperate createLog,lm=" + m);
	}

	public List<OLogModel> getAllLog() {
		System.out.println("Now in LogDbOperate getAllLog");
		return null;
	}

	public void removeLog(OLogModel m) {
		System.out.println("Now in LogDbOperate removeLog,lm=" + m);
	}

	public void updateLog(OLogModel m) {
		System.out.println("Now in LogDbOperate updateLog,lm=" + m);
	}

}
