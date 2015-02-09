package com.sco.jni;

/**
 * 
 * @author Lang
 * @package com.sco.jni
 * @name MemoryAddress
 * @class com.sco.jni.MemoryAddress
 * @date Dec 4, 2014 6:07:46 PM
 * @see
 */
public class MemoryAddress {
	static {
		System.loadLibrary("memoryAddress");
	}
	
	public native void printAddress(int[][][][] inputArr);
	
	public native void printAddress(char[][][][] inputArr);
	
	public native void printAddress(short[][][][] inputArr);
	
	public native void printAddress(long[][][][] inputArr);
	
	public native void printAddress(boolean[][][][] inputArr);
	
	public native void printAddress(byte[][][][] inputArr);

	public native void printAddress(int[][][] inputArr);

	public native void printAddress(int[][] inputArr);

	public native void printAddress(char[][] inputCArr);

	public native void printAddress(int[] intArr);

	public native void printAddress(char[] charArr);

	public native void printAddress(boolean inputB);

	public native void printAddress(byte inputByte);

	public native void printAddress(short inputS);

	public native void printAddress(int inputI);

	public native void printAddress(long inputL);

	public native void printAddress(float inputF);

	public native void printAddress(double inputD);

	public native void printAddress(char inputC);
}
