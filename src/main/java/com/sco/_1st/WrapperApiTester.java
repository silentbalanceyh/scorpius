package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name WrapperApiTester
 * @class com.sco._1st.WrapperApiTester
 * @date Dec 6, 2014 9:57:28 PM
 * @see
 */
public class WrapperApiTester {
	public static void main(String args[]){
		// 1.String -> Primitive Type
		String item = "222";
		int intValue = Integer.parseInt(item);
		short shortValue = Short.parseShort(item);
		Integer intValue1 = Integer.parseInt(item);
		System.out.println(intValue);
		System.out.println(shortValue);
		System.out.println(intValue1);
		
		// 2.Value Of
		int int1 = 212;
		System.out.println(Integer.valueOf(int1));
		System.out.println(Integer.valueOf("234"));
		// 4.Compare
		int int2 = 21;
		int int3 = 21;
		int int4 = 22;
		System.out.println(Integer.compare(int2,int3));
		System.out.println(Integer.compare(int2,int4));
		System.out.println(Integer.compare(int4,int2));
	}
}
