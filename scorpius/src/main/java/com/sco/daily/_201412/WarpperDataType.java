package com.sco.daily._201412;

public class WarpperDataType {
	public static void main(String args[]){
		int iA;
		Integer iB = new Integer(13);
		iA = iB;		// 选的JDK1.4，报错。 JDK1.3 也不报错。 O_O
		
		System.out.println(iA);
		
		int iC;
		iC = 'a' + 'b';
		System.out.println(iC); 
			
		iB = Integer.valueOf("123");
		System.out.println(iB); 
		String strB = "123";
		iB = Integer.parseInt(strB);
		System.out.println(iB); 
		iB = Integer.parseInt(strB,8);
		System.out.println(iB); 
	}

}
