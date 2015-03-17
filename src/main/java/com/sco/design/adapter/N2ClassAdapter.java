package com.sco.design.adapter;

import java.util.List;
/**
 * 类适配器方式
 * @author Lang Yu(lang.yu@hp.com)
 * @time Apr 13, 2011 8:01:37 PM
 * @file N2ClassAdapter.java
 * @package com.sco.design.adapter
 * @version 1.0
 * @see
 */
public class N2ClassAdapter extends OLogFileOperate implements OLogDbOperateApi{
	public N2ClassAdapter(String logFilePathName){
		super(logFilePathName);
	}
	
	public void createLog(OLogModel m){
		List<OLogModel> list = this.readLogFile();
		
		list.add(m);
		
		this.writeLogFile(list);
	}
	
	public List<OLogModel> getAllLog(){
		return this.readLogFile();
	}
	
	public void removeLog(OLogModel m){
		List<OLogModel> list = this.readLogFile();
		
		list.remove(m);
		
		this.writeLogFile(list);
	}
	
	public void updateLog(OLogModel m){
		List<OLogModel> list = this.readLogFile();
		
		for( int i = 0; i < list.size(); i++ ){
			if(list.get(i).getLogId().equals(m.getLogId())){
				list.set(i, m);
				break;
			}
		}
		this.writeLogFile(list);
	}
}
