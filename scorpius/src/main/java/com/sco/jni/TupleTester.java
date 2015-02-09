package com.sco.jni;

/**
 * 
 * @author Lang
 * @package com.sco.jni
 * @name TupleTester
 * @class com.sco.jni.TupleTester
 * @date Dec 6, 2014 11:31:56 AM
 * @see
 */
public class TupleTester {
	public static void main(String args[]) {
		int[][][][] tuple = {
				{ { { 11, 45, 13, 16 }, { 12, 44, 46, 55 }, { 13, 33, 56, 14 } } },
				{ { { 11, 45, 13, 16 }, { 12, 44, 46, 55 }, { 13, 33, 56, 14 } } },
				{ { { 11, 45, 13, 16 }, { 12, 44, 46, 55 }, { 13, 33, 56, 14 } } },
				{ { { 11, 45, 13, 16 }, { 12, 44, 46, 55 }, { 13, 33, 56, 14 } } },
				{ { { 11, 45, 13, 16 }, { 12, 44, 46, 55 }, { 13, 33, 56, 14 } } } };
		MemoryAddress memAddr = new MemoryAddress();
		memAddr.printAddress(tuple);
	}
}
