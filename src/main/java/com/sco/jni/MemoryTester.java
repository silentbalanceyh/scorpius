package com.sco.jni;

import java.util.Random;
/**
 * 
 * @author Lang
 * @package com.sco.jni
 * @name MemoryTester
 * @class com.sco.jni.MemoryTester
 * @date Dec 6, 2014 10:47:14 AM
 * @see
 */
public class MemoryTester {
	public static void main(String[] args) {
		Random random = new Random();
		MemoryAddress memAddr = new MemoryAddress();
		// 1.Char地址空间
		char[] charArr = { 'A', 'C', 'T', 'E' };
		memAddr.printAddress(charArr);
		// 2.Int地址空间
		int[] intArr = { 12, 34, 56, 77, 99 };
		memAddr.printAddress(intArr);

		int[][] arrays1 = new int[3][4];
		for (int i = 0; i < arrays1.length; i++) {
			arrays1[i] = new int[4];
			for (int j = 0; j < arrays1[i].length; j++) {
				arrays1[i][j] = random.nextInt(50) + 10;
			}
		}
		int[][] arrays2 = { { 34, 76, 54, 67, 80 }, { 55, 56, 76, 80 },
				{ 90, 87, 86, 11, 23 },
				{ 33, 67, 58, 90, 77, 11, 23, 45, 80, 90 } };
		
		printArray(arrays1);
		printArray(arrays2);
		memAddr.printAddress(arrays1);
		memAddr.printAddress(arrays2);

	}

	private static void printArray(int[][] arrays) {
		System.out.print("Matrix -> \n");
		for (int[] array : arrays) {
			for (int item : array) {
				System.out.print("[" + item + "],");
			}
			System.out.println();
		}
	}
}
