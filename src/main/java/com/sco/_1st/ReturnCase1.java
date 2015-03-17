package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ReturnCase1
 * @class com.sco._1st.ReturnCase1
 * @date Dec 11, 2014 4:09:44 PM
 * @see
 */
public class ReturnCase1 {
	public static void main(String args[]){
		printReturn();
		System.out.println("\t=================");
		printBreak();
	}
	
	private static void printReturn(){
		for( int i = 0; i < 5; i++ ){
			System.out.println("\ti的值是" + i);
			if( i == 2 ){
				return;
			}
		}
		System.out.println("\tReturn跳出语句不执行这句");
	}
	
	private static void printBreak(){
		for( int i = 0; i < 5; i++ ){
			System.out.println("\ti的值是" + i);
			if( i == 2 ){
				break;
			}
		}
		System.out.println("\tBreak跳出语句执行这句");
	}
}
