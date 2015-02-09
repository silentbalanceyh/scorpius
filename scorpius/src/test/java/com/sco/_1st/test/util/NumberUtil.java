package com.sco._1st.test.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Lang
 * @package com.sco._1st.test.util
 * @name NumberUtil
 * @class com.sco._1st.test.util.NumberUtil
 * @date Dec 7, 2014 9:51:51 AM
 * @see
 */
public final class NumberUtil {
	
	private NumberUtil(){}
	
	public static boolean isPrime(int limit){
		boolean flag = true;
		for( int i = 2; i <= Math.sqrt(limit); i++ ){
			if( limit % i == 0 ){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static boolean isNarcissistic(int limit){
		boolean flag = false;
		int unitsDigit = limit % 10;
		int tensDigit = (limit / 10) % 10;
		int hundredsDigit = limit / 100;
		int calRet = (int)(Math.pow(unitsDigit, 3) + Math.pow(tensDigit,3) + Math.pow(hundredsDigit, 3));
		if(calRet == limit){
			flag = true;
		}
		return flag;
	}
	
	public static Integer[] calculateSubvalues(int inValue){
		List<Integer> retList = new ArrayList<>();
		int key = 1;
		int inNumber = inValue;
		while(inNumber > 1){
			for( int i = 2; i <= inNumber; i++ ){
				if(inNumber % i == 0){
					key = i;
					retList.add(key);
					break;
				}
			}
			inNumber = inNumber / key;
		}
		return retList.toArray(new Integer[]{});
	}
}
