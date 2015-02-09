package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpLeftRight
 * @class com.sco._1st.OpLeftRight
 * @date Dec 15, 2014 1:42:30 PM
 * @see
 */
public class OpLeftRight {
	public static void main(String args[]){
		int i = 0;
		int j = 1;
		System.out.println(12-~++i+~i);
		System.out.println(-~~++j);
	}
}
