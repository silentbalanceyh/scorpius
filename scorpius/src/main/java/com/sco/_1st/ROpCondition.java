package com.sco._1st;
/**
 * 
 *
 * @author Lang
 * @see
 */
public class ROpCondition {
	// ~ Static Methods ======================================
	
	public static void main(String args[]){
		Integer inputArg = Integer.parseInt(args[0]);
		
		if(inputArg > 0){
			System.out.println("你输入的是正数！");
		}else{
			System.out.println("你输入的是非负数！");
		}
	}
}
