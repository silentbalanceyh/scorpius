package com.sco.design.adapter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class OLogFileOperate implements OLogFileOperateApi{
	
	private String logFilePathName = "AdapterLog.log";
	
	public OLogFileOperate(String logFilePathName){
		if(logFilePathName != null &&
				logFilePathName.length() > 0){
			this.logFilePathName = logFilePathName;
		}
	}

	@SuppressWarnings("unchecked")
	public List<OLogModel> readLogFile() {
		List<OLogModel> list = null;
		ObjectInputStream oin = null;
		try{
			File f = new File(logFilePathName);
			if(f.exists()){
				oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
			}
			list = (List<OLogModel>)oin.readObject();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				if(oin != null){
					oin.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		return list;
	}

	public void writeLogFile(List<OLogModel> list) {
		File f = new File(logFilePathName);
		ObjectOutputStream oout = null;
		try{
			oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
			oout.writeObject(list);
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			try{
				oout.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
	}

}
