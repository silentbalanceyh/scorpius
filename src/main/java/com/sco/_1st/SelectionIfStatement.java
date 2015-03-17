package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SelectionIfStatement
 * @class com.sco._1st.SelectionIfStatement
 * @date Dec 6, 2014 10:39:14 PM
 * @see
 */
public class SelectionIfStatement {
	
	public static void main(String args[]){
		// 1.If statement
		boolean flag = Integer.compare(11,12) < 0;
		if(flag)
			System.out.println("Smaller!");
		
		if(Boolean.valueOf(flag)){ // Since JDK 1.5 
			System.out.println("Smaller!");
		}
		
		/*if(Integer.compare(11, 12)){	
		 * Incorrect
		}*/
		// 2.If Incorrect Using
		int a = 12;
		int b = 10;
		int ret = 12;
		if( a < 0 )
			ret = ret + 2;
			ret = ret + b;
		System.out.println(ret);
	}
}
