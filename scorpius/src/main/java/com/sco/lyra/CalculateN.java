package com.sco.lyra;
/**
 * 
 * @author Lang
 * @package com.sco.lyra
 * @name CalculateN
 * @class com.sco.lyra.CalculateN
 * @date Dec 7, 2014 9:23:29 AM
 * @see
 */
public class CalculateN {
	public static void main(String args[]){
		int n = 0;
		for(int i = 1; i < 100; i++ ){
			if( i % 3 == 1 && i % 5 == 3 && i % 7 == 0){
				n = i;
				break;
			}
		}
		System.out.println("N Value is " + n);
	}
}
