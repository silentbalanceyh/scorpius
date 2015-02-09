package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ArrayDefine
 * @class com.sco._1st.ArrayDefine
 * @date Dec 2, 2014 10:53:29 PM
 * @see
 */
public class ArrayDefine {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int[] a = new int[4];
		int a2[] = new int[4];
		int a3[] = new int[] { 1, 2, 4 };
		// int a3 [] = new int[3]{1,2,4}; Incorrect
		int a4[][] = new int[1][];
		int [][]a5 = new int[4][3];
		int a6[    ][] = new int[][]{{1,2},{3,4}};
		// int a6[][] = new int[][3]; Incorrect
		// int a6[][] = new int[][]{3,4}; Incorrect
		// int a6[] [] = new int[][]{{{3}}}; Incorrect
		// int a11[] = new int[];
		int [] a7 [] = new int[5][9];
		int a8[][][] = new int[][][]{};
		int a9[][][] = new int[][][]{{{6},{7,8,9}},{{5},{4}}};
		
		int a10[] = {1,4,5,67};
		long a11[] = new long[11];
		// a10 = (int[])a11; Incorrect
	}
}
