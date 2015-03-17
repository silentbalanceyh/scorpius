package com.sco._1st.test;
//import static com.sco._1st.test.util.Progress.NOT_START;

import java.math.BigDecimal;
/**
 * 
 * @author Lang
 * @package com.sco._1st.test
 * @name ArrayCase
 * @class com.sco._1st.test.ArrayCase
 * @date Dec 3, 2014 1:08:48 AM
 * @see
 */
public class ArrayCase {

	public long[] function5(final String[] inputArr){
		// FINISH: 1-5.将传入的数组的每一个元素运算，得到新的数组，每一个元素翻两倍
		long[] lArr = new long[inputArr.length];
		BigDecimal bigValue ;
		for(int i =0; i < inputArr.length; i++){
			bigValue = BigDecimal.valueOf(Long.valueOf(inputArr[i])).multiply(BigDecimal.valueOf(2)) ;		
			lArr[i] = bigValue.longValue();
		}	
		return lArr; //NOT_START();
	}
	
	public boolean[][] function5x9(final int[] x, final int[] y){
		/**
		 * TODO: ( Need correction for all test cases. ) 1-6.创建一张课程表，要求如下：（一维5，二维9）
		 * 1）一共5天，每天早上4节课，下午3节课，晚上2节课
		 * 2）如果有可用true表示，翘课用false表示
		 * 3）course为传入的翘课的坐标，传入坐标成对
		 * 输入检查：
		 * 1）x和y长度必须相同，不相同返回4 x 5的全false数组
		 * 2）标准返回应该是5 x 9的数组
		 * 3）x和y不能越界，如果越界返回3 x 7的全true数组
		 */
		boolean[][] returnF = new boolean[4][5];
		for(int i =0; i < returnF.length; i++){
			for(int j = 0; j < returnF[i].length; j++){
				returnF[i][j] = false;
			}
		}
		
		boolean[][] returnT = new boolean[3][7];
		for(int i =0; i < returnT.length; i++){
			for(int j = 0; j < returnT[i].length; j++){
				returnT[i][j] = true;
			}
		}
		
		boolean[][] iCourse = new boolean[5][9];
		for(int i = 0; i < iCourse.length; i++){
			for(int j = 0; j < iCourse[i].length; j++){
				iCourse[i][j] = true;
			}
		}
		
		if(x.length != y.length){
			return returnF;			
		}
		
		int iRowLength = 5;
		int iColLength = 9;
		for(int i = 0; i < x.length; i++){
			if(x[i] >= iRowLength || y[i] >= iColLength){
				return returnT;
			}
			iCourse[x[i]][y[i]] = false;	
		}
		
		return iCourse; 	//NOT_START();
	}
}
