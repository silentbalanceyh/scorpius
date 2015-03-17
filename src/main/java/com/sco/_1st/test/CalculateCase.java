package com.sco._1st.test;

//import static com.sco._1st.test.util.Progress.NOT_START;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Lang
 * @package com.sco._1st.test
 * @name CalculateCase
 * @class com.sco._1st.test.CalculateCase
 * @date Dec 7, 2014 9:27:25 AM
 * @see
 */
public class CalculateCase {
	/**
	 * 一堆人n，( n < 100 )
	 * 1）三个站成一排多一个人出来
	 * 2）七个人站成一排刚好合适
	 * 3）五个人站成一排差两个人
	 * 
	 * @return
	 */
	public Integer calculateN(){
		// FINISH: 1-7.计算n的值
		
		for(int iNumber = 0; iNumber < 100; iNumber ++ ){
			if((iNumber % 3 == 1) && (iNumber % 7 ==0) && ((iNumber+2) % 5 == 0)){
				return iNumber;
			}
		}
		return 0;//NOT_START();
	}
	/**
	 * 计算小于limit的素数，并且使用数组返回所有的素数
	 * @param limit
	 * @return
	 */
	public Integer[] calculatePrime(int limit){
		// FINISH: 1-8.计算小于limit的所有素数
		final List<Integer> arrList = new ArrayList<>();
		for(int i = 2; i < limit; i++){
			if(i <= 3){
				arrList.add(i);
			}else{
				for(int j = 2; j <= (int)Math.sqrt(i); j++){
					if(i % j == 0){
						break;
					}
					if(j >= (int)Math.sqrt(i)){
						arrList.add(i);	
					}
				}
			}
		} 
		final Integer[] arrInteger = (Integer[]) arrList.toArray(new Integer[arrList.size()]);	
		return arrInteger;
	//	return NOT_START();
	}
	/**
	 * 水仙花数：一个三位数，其各位数字立方和等于该数本身，如：
	 * 153 = 1^3 + 5^3 + 3^3
	 * @param limite
	 * @return
	 */
	public Integer[] calculateNarcissistic(int limit){
		// FINISH: 1-9.计算小于limit的所有“水仙花数”
		final List<Integer> arrList = new ArrayList<>();
		int intA, 
			intB,
			intC;
		int i = 100;
		while(i < limit){
			intA = i % 10;
			intB = i / 10 % 10;
			intC = i / 100;
			
			if(intC >= 10 ){
				break;
			}
			final int intValue = (int) (Math.pow(intA, 3) + Math.pow(intB, 3) + Math.pow(intC, 3));
			if(i == intValue ){
				arrList.add(i);
			}
			i++;
		}
	
		final Integer[] arrInteger = (Integer[]) arrList.toArray(new Integer[arrList.size()]);
		return arrInteger;
	//	return NOT_START();
	}
	/**
	 * 寻找一个数的因式
	 * 比如：90，得到的数组为：2,3,3,5，因为90 = 2*3*3*5
	 * 对n进行因式分解，找到一个最小质数k：
	 * 1）如果这个数较好等于n，说明因式分解过程已经结束
	 * 2）如果n != k，但n可以被k整除，则得到k，并且用n除以k的赏我在新的正整数n，重复执行第一步
	 * 3）如果n不可以被k整除，则用k + 1作为k的值，重复执行第一步
	 * @param limit
	 * @return 按顺序排列的数组
	 */
	public Integer[] calculateExpand(int limit){
		// TODO: 1-10.將輸入的數进行因式分解
		final List<Integer> arrList = new ArrayList<>();
		int intK = 2;
		int intN = limit;

		loop:
		while(intN != intK ){
			if(intN % intK == 0){
				intN = intN / intK;
				arrList.add(intK);
			}else{
				intK += 1;				
				continue loop;
			}				
		}
		arrList.add(intK);			
	
		final Integer[] arrInteger = (Integer[]) arrList.toArray(new Integer[arrList.size()]);
		return arrInteger;
	//	return NOT_START();
	}
}
