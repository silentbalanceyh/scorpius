package com.sco.design.factory.simple;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 通过配置文件选择不同的实现，通过一个配置文件来实现
 * @author yulan
 */
public class N2Factory {
	public static OApi createApi(){
		Properties p = new Properties();
		InputStream in = null;
		try{
			in = N2Factory.class.getClassLoader().getResourceAsStream("FactoryTest.properties");
			p.load(in);
		}catch(IOException ex){
			System.out.println("装载工厂配置文件出错，具体堆栈信息如下：");
			ex.printStackTrace();
		}finally{
			try{
				in.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
		OApi api = null;
		try{
			api = (OApi)Class.forName(p.getProperty("ImplClass")).newInstance();
		}catch(InstantiationException ex){
			ex.printStackTrace();
		}catch(IllegalAccessException ex){
			ex.printStackTrace();
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		return api;
	}
}
