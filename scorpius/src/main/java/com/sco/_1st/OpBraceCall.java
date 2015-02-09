package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpBraceCall
 * @class com.sco._1st.OpBraceCall
 * @date 2014年12月15日 上午11:30:12
 * @see
 */
public class OpBraceCall {
	@SuppressWarnings("unused")
	private static int INT_VALUE;
	
	static{
		INT_VALUE = 12;
	}
	
	public static void main(String args[]){
		final int[] arr = {12,34,56,78,90};
		final int[] arr1 = new int[]{121,343,565,787,909};
		
		if(arr.length > 0){
			System.out.println(arr[0]);
		}else{
			System.out.println("No element in array: arr.");
		}
		for( int i = 0; i < arr1.length; i++ ){
			System.out.println(arr1[i]);
		}
		
		int xyz1 = 44;
		System.out.println(xyz1);
		{
			int xyz = 123;
			System.out.println(xyz);
		}
	}
	
	public static void print(){
		System.out.println("hello");
	}
}

class A{
	@SuppressWarnings("unused")
	private String name;
}
