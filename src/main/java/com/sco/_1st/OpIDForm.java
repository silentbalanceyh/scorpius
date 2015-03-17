package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpIDForm
 * @class com.sco._1st.OpIDForm
 * @date Dec 18, 2014 6:18:39 AM
 * @see
 */
public class OpIDForm {
	public static void main(String args[]){
		int i = 0;
		int result = 0;
		result = ++i+i;
		// result = ++i++i; 				Incorrect
		// result = ++i+++i;				Incorrect
		// result = ++i +++i; 				Incorrect
		result = ++i +(++i);
		// result = ++i++++i;				Incorrect
		result = ++i+i++;
		// result = ++i++i++;				Incorrect
		// result = ++i+++i++;				Incorrect
		// result = ++i +(++i)++;			Incorrect
		result = i+i++;
		// result = i++i++;					Incorrect
		result = i+++i++;
		// result = i++++i++;				Incorrect
		// result = i+++++i++;				Incorrect
		// result = i++i;					Incorrect
		result = i+++i;
		result = i++ +(++i);
		System.out.println(result);
	}
}
