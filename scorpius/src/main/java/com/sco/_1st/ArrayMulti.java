package com.sco._1st;

import java.util.Random;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ArrayMulti
 * @class com.sco._1st.ArrayMulti
 * @date Dec 3, 2014 12:51:56 AM
 * @see
 */
public class ArrayMulti {
	public static void main(String args[]){
        // 二维规则数组
        int[][] arrays = new int[3][3];
        Random random = new Random();
        for( int i = 0; i < arrays.length; i++){
            for( int j = 0; j < arrays[i].length; j++){
                arrays[i][j] = random.nextInt(40);
            }
        }
        printArray(arrays);
        System.out.println("------------------------");
        // 二维不规则数组
        int[][] arrays1 = new int[3][];
        for( int i = 0; i < arrays1.length; i++){
            int innerLength = random.nextInt(6) + 1;
            arrays1[i] = new int[innerLength];
            for( int j = 0; j < arrays1[i].length; j++){
                arrays1[i][j] = random.nextInt(40);
            }
        }
        //System.out.println(Arrays.asList(arrays1))
        printArray(arrays1);
        System.out.println("------------------------");
        int[][] arrays2 = {{12,33},{45,44,46,47},{56,12,9}};
        printArray(arrays2);
    }
    private static void printArray(int [][] arrays){
        for(int[] array:arrays){
            for(int item:array){
                System.out.print("[" + item + "],");
            }
            System.out.println();
        }
    }
}
