package com.sco.daily._201412;

public class BooleanType {
	public static void main(String args[]){
		boolean booleanValue1 = new Boolean("True");
		System.out.println(booleanValue1);
		
		boolean booleanValue2 = new Boolean("false");
		System.out.println(booleanValue2);
		
		String str1 = "false";
		System.setProperty(str1, "true");
		System.out.println(Boolean.getBoolean(str1));

		String str2 = "false";
		System.setProperty(str2, "false");
		System.out.println(Boolean.getBoolean(str2));
		
		String str3 = "true";
		System.setProperty(str3, "false");
		System.out.println(Boolean.getBoolean(str3));
		
		String str4 = "True";
		System.out.println(Boolean.getBoolean(str4));
		
		String str5 = "true";
		System.out.println(Boolean.getBoolean(str5));
		
		System.setProperty("XX", "true");
		System.out.println(Boolean.getBoolean("XX"));
		
		
	}
	
}
