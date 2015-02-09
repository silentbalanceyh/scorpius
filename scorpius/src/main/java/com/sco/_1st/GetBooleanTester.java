package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name GetBooleanTester
 * @class com.sco._1st.GetBooleanTester
 * @date 2014年12月5日 下午3:03:59
 * @see
 */
public class GetBooleanTester {
	
	public static void main(String args[]){
		
		
		String s2 = new String("true");
		// 存放系统属性
		String s1 = "true";
		System.setProperty(s1, "true");
		System.out.println(Boolean.getBoolean(s1));
		
		System.setProperty(s2, "true");
		System.out.println(Boolean.getBoolean(s2));
		String s3 = "True";
		System.out.println(Boolean.getBoolean(s3));
		
		System.setProperty("name","true");
		System.out.println(Boolean.getBoolean("name"));
	}
}
