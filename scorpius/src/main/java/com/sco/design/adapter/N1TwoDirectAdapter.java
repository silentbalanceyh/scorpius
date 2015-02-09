package com.sco.design.adapter;

import java.util.List;

public class N1TwoDirectAdapter implements OLogDbOperateApi,OLogFileOperateApi{
	
	private OLogFileOperateApi fileLog;
	
	private OLogDbOperateApi dbLog;
	
	public N1TwoDirectAdapter(OLogFileOperateApi fileLog,
			OLogDbOperateApi dbLog){
		this.fileLog = fileLog;
		this.dbLog = dbLog;
	}

	public void createLog(OLogModel m) {
		List<OLogModel> list = fileLog.readLogFile();
		
		list.add(m);
		
		fileLog.writeLogFile(list);
	}

	public List<OLogModel> getAllLog() {
		return fileLog.readLogFile();
	}

	public void removeLog(OLogModel m) {
		List<OLogModel> list = fileLog.readLogFile();
		
		list.remove(m);
		
		fileLog.writeLogFile(list);
	}

	public void updateLog(OLogModel m) {
		List<OLogModel> list = fileLog.readLogFile();
		for( int i = 0; i < list.size(); i++ ){
			if(list.get(i).getLogId().equals(m.getLogId())){
				list.set(i, m);
				break;
			}
		}
		fileLog.writeLogFile(list);
	}

	public List<OLogModel> readLogFile() {
		return dbLog.getAllLog();
	}

	public void writeLogFile(List<OLogModel> list) {
		for(OLogModel m: list){
			dbLog.createLog(m);
		}
	}

}
