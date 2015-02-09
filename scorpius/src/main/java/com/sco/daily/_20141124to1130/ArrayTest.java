package com.sco.daily._20141124to1130;

public class ArrayTest {
	public static void main(String args[]){
		/*
		 * 一维数组
		 */
		int iArr1[] = {1, 2, 3, 4, 5, 6};
	//	int iArr1[] = {};
		int iArr2[] = new int[5];
		int[   ] iArr3 = new int[]{1, 2, 3, 4, 5, 6};
		iArr3[0] = 1;
		int i = 0;
		int j = 0;
		for(int item : iArr2){
			iArr2[item] = i;
			System.out.println(item + " - " + iArr2[item]);
	//		System.out.println(item + " - " + iArr2[i]);
			i++;
	// 		无法引用数组的索引
		}
		System.out.println("------while-------");
		i = 0;
		while(i < iArr1.length){
			System.out.println(iArr1[i]);
			i++;
			
		}
		
		System.out.println("------d0 - while-------");
		i = 0;
		int iLength;
		iLength = iArr1.length;
		do{
			if(iLength == 0){
				System.out.println("iArr1 is null !");
				break;
			}
			System.out.println(iArr1[i]);
			i++;
			
		}while(i < iArr1.length);
		
		/*
		 * 二维数组
		 */
	//	double[][] dArr1 = {{1,2}, {2,3}, {3,4}, {4,5}};
	//	double[][   ] dArr2 = new double[4][];
		double dArr3[][]= new double[2][3];
		double[] dArr4 [] = new double[][]{{0.0,0.1}, {1.0,1.2}, {2.0,2.1}, {3.0,3.1}};
		double[] dArr5 [] = new double[][]{{0.0,0.1}, {1.0,1.1,1.2}, {2.0,2.1,2.2,2.3}, {3.0,3.1}};
	//	double[] dArr4 [] = new double[][]{};

		System.out.println("-------赋值，打印--------");
		i = 0;
		for(double[] item : dArr3){
			for(j = 0; j < item.length; j++){
				dArr3[i][j] = j;
				System.out.print(dArr3[i][j] + "  ");
			}
			i++;
			System.out.println();
		}
		System.out.println("------遍历，打印-------");
		i = 0;
		for(double[] item : dArr4){
			for(j = 0; j < item.length; j++){
		//		dArr3[i][j] = 9;
				System.out.print(dArr4[i][j] + "  ");
			}
			i++;
			System.out.println();
		}
		System.out.println("------while-------");
		i = 0;
		j = 0;
		while(i < dArr4.length){
			while(j < dArr4[i].length){
				System.out.print(dArr4[i][j] + "  ");
				j++;
			}
			j = 0;
			i++;
			System.out.println();
		}
		
		System.out.println("------d0 - while-------");
		i = 0;
		iLength = dArr4.length;
		do{
			if(iLength == 0){
				System.out.print("dArr4 is null !");
				break;
			}
			
			do{
				
				System.out.print(dArr4[i][j] + "  ");
				j++;
			}while(j < dArr4[i].length);
			j = 0;
			i++;
			System.out.println();
		}while(i < dArr4.length);
		
		/*
		 * 遍历
		 */
		System.out.println("------列遍历-------");
		for(i = 0; i < dArr5.length; i++){
			for(j = 0; j < dArr5[i].length; j++)
			{
				System.out.print(dArr5[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("------行遍历-------");

		int rowLength = dArr5.length;
		int colLength = dArr5[0].length;
		for(j = 0; j < colLength; j++){
			for(i = 0; i < rowLength; i++ ){
				if( j == 0 && colLength <= dArr5[i].length){
					colLength = dArr5[i].length;
				}		
				if(j > dArr5[i].length-1){
					System.out.print("     ");
					continue;
				}
				System.out.print(dArr5[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
