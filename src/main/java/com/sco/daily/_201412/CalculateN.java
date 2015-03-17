package com.sco.daily._201412;

public class CalculateN {
	public static void main(String args[]){
		int iCount;
		int iRange = 1000;
		iCount = CalcN(iRange);
		System.out.println("在范围内符合条件的数字共：" + iCount + "个");
	}
	
	public static int CalcN(int iRange){
		int iCount = 0;
		for(int iNumber = 0; iNumber < iRange; iNumber ++ ){
			if((iNumber % 3 == 1) && (iNumber % 7 ==0) && ((iNumber+2) % 5 == 0)){
				iCount++;
				System.out.println("第 " + iCount +" 个n的大小为： " + iNumber);
			}
		}
		return iCount;
	}

}
