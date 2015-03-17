package com.sco.design.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class OAppConfig {
	private String parameterA;
	private String parameterB;
	public String getParameterA() {
		return parameterA;
	}
	public String getParameterB() {
		return parameterB;
	}
	
	public OAppConfig(){
		readConfig();
	}
	
	private void readConfig(){
		Properties p = new Properties();
		InputStream in = null;
		try{
			in = OAppConfig.class.getClassLoader().getResourceAsStream("AppConfig.properties");
			p.load(in);
			this.parameterA = p.getProperty("paramA");
			this.parameterB = p.getProperty("paramB");
		}catch(IOException ex){
			System.out.println("装载配置文件出错，具体堆栈信息如下：");
			ex.printStackTrace();
		}finally{
			try{
				in.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
}
