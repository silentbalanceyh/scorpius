package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpBracketCall
 * @class com.sco._1st.OpBracketCall
 * @date 2014年12月15日 上午10:49:47
 * @see
 */
public class OpBracketCall {
	public static void main(String args[]){
		print(20);
		int c = (10 + 12) * 3;
		System.out.println(c);
	}
	
	public static void print(int length){
		for(int i = 0; i < length; i++){
			System.out.println(i);
		}
	}
}
