package com.sco._1st;

import com.sco.jni.MemoryAddress;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name BooleanMemory
 * @class com.sco._1st.BooleanMemory
 * @date Dec 6, 2014 6:43:18 PM
 * @see
 */
public class BooleanMemory {

	public static void main(String args[]) {
		MemoryAddress memAddr = new MemoryAddress();
		for (int i = 0; i < 3; i++) {
			memAddr.printAddress(Boolean.TRUE);
			memAddr.printAddress(Boolean.FALSE);
			memAddr.printAddress(true);
			memAddr.printAddress(false);
		}
	}
}
