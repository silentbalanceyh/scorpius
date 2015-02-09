package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SwitchBreak1
 * @class com.sco._1st.SwitchBreak1
 * @date Dec 7, 2014 12:23:23 AM
 * @see
 */
public class SwitchBreak1 {
	public static void main(String args[]){
		for( int i = -1; i < 11; i++ ){
			divideEven(i);
		}
	}
	
	public static void divideEven(int input){
		switch(input){
		case 2:
		case 4:
		case 6:
		case 8:System.out.println("偶数:" + input);break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:System.out.println("奇数:" + input);break;
		default:System.out.println("范围外:" + input);break;
		}
	}
}
