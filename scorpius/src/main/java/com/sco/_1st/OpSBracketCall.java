package com.sco._1st;

import com.sco.lyra.util.Logger;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpSBracketCall
 * @class com.sco._1st.OpSBracketCall
 * @date 2014年12月15日 上午9:50:39
 * @see
 */
public class OpSBracketCall {
	public static void main(String args[]){
		final Integer[] arr = {12,14,15,16};
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		print(arr);
	}
	
	public static void print(Integer[] inputArr){
		final Integer[] arr = new Integer[]{12,13,35,46,78};
		final Integer[] arrOne = new Integer[3];
		Logger.outObject(OpSBracketCall.class, arr);
		Logger.outObject(OpSBracketCall.class, arrOne);
		Logger.outObject(OpSBracketCall.class, inputArr);
	}
}
