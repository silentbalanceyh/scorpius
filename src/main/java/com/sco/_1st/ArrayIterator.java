package com.sco._1st;

import java.util.Random;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name ArrayIterator
 * @class com.sco._1st.ArrayIterator
 * @date Dec 3, 2014 3:08:38 AM
 * @see
 */
public class ArrayIterator {
	public static void main(String args[]) {
		// 一维数组遍历
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.print("Arr=");
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("%d,", arr1[i]);
		}
		System.out.print("\nArr1=");
		for (int i : arr2) {
			System.out.printf("%d,", i);
		}
		// 二维
		int[][] arr3 = new int[5][6];
		Random random = new Random();
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				// [min,max] = random.nextInt(max) % (max - min + 1) + min;
				arr3[i][j] = random.nextInt(40) % ((40 - 20) + 1) + 20;
			}
		}
		System.out.println(arrToString(arr3));
		// 二维
		int m = 0;
		for (int[] item : arr3) {
			for (int j = 0; j < item.length; j++) {
				System.out.print(arr3[m][j] + " [i=" + m + ",j=" + j + "]  , ");
			}
			System.out.println();
			m++;
		}
		// 二维数组列遍历，针对规则数组
		System.out.println("列遍历：");
		// Get Column
		if (arr3.length > 0) {
			int column = arr3[0].length;
			int j = 0;
			while (j < column) {
				for (int x = 0; x < arr3.length; x++) {
					System.out.print(arr3[x][j] + " [i=" + x + ",j=" + j
							+ "]  , ");
				}
				System.out.print("\r");
				j++;
			}
		}
		// 倾斜遍历
		System.out.println("倾斜遍历：");
		int[][] arr4 = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr4[i][j] = i;// 数组赋值
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr4[i][j]);// 输出数组
			}
			System.out.println();
		}
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 9; j++) {
				if (((i - j) >= 0) && ((i - j) < 9))// 每次倾斜的数组的下标相加的结果是一样的
				{
					System.out.print(arr4[j][i - j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		for (int i = -8; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (((i + j) >= 0) && ((i + j) < 9))// 每次倾斜的数组的下标相减的结果是一样的
				{
					System.out.print(arr4[j][i + j] + " ");
				}
			}
			System.out.println();
		}
		// 矩阵乘法（Required）
		System.out.println("矩阵乘法：");
		int[][] arr5 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 } };
		int[][] arr6 = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		int aRow = arr5.length;
		int bCol = arr6[0].length;
		int m1 = arr6.length;
		int[][] arr7 = new int[aRow][bCol];
		for (int i = 0; i < aRow; i++) {
			for (int j = 0; j < bCol; j++) {
				int result = 0;
				for (int k = 0; k < m1; k++) {
					result += arr5[i][k] * arr6[k][j];
				}
				arr7[i][j] = result;
			}
		}

		for (int i = 0; i < arr7.length; i++) {
			for (int j = 0; j < arr7[i].length; j++) {
				System.out.print(arr7[i][j] + "\t");
			}
			System.out.println();
		}
		// 求A的逆矩阵 = A* / |A| （Optional）
		System.out.println("逆矩陣：");
		int [][] arr8 = getDY(data6, 2, 3);
		for (int i = 0; i < data6.length; i++) {
			for (int j = 0; j < data6[i].length; j++) {
				System.out.print(data6[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===========================");
		for (int i = 0; i < arr8.length; i++) {
			for (int j = 0; j < arr8[i].length; j++) {
				System.out.print(arr8[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static int[][] data6 = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
			{ 3, 4, 3, 2, 2, 1 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
			{ 1, 2, 3, 4, 5, 6 },
	};

	static int[][] data5 = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 1 },
			{ 3, 4, 5, 1, 2 }, { 4, 5, 1, 2, 3 }, { 5, 1, 2, 3, 4 },

	};

	static int[][] data4 = { { 1, 0, -1, 2 }, { -2, 1, 3, 1 },
			{ 0, 2, 0, -2 }, { 1, 3, 4, -2 },

	};
	static int[][] data3 = { { 1, 2, -1 }, { 3, 1, 0 }, { -1, -1, -2 }, };

	/**
	 * A的逆矩阵 = A* / |A| 1.求A* 2.求|A|
	 * 
	 * @param data
	 * @param h
	 * @param v
	 * @return
	 */
	public static int[][] getDY(int[][] data, int h, int v) {
		int H = data.length;
		int V = data[0].length;
		int[][] newData = new int[H - 1][V - 1];

		for (int i = 0; i < newData.length; i++) {
			if (i < h - 1) {
				for (int j = 0; j < newData[i].length; j++) {
					if (j < v - 1) {
						newData[i][j] = data[i][j];
					} else {
						newData[i][j] = data[i][j + 1];
					}
				}
			} else {
				for (int j = 0; j < newData[i].length; j++) {
					if (j < v - 1) {
						newData[i][j] = data[i + 1][j];
					} else {
						newData[i][j] = data[i + 1][j + 1];
					}
				}
			}
		}
		System.out.println("代数余子式");
		for (int i = 0; i < newData.length; i++) {
			for (int j = 0; j < newData[i].length; j++) {
				System.out.print(newData[i][j] + "\t");
			}
			System.out.println();
		}
		return newData;
	}

	// 2.求行列式
	public static int getHL(int[][] data) {

		// 终止条件
		if (data.length == 2) {
			return data[0][0] * data[1][1] - data[0][1] * data[1][0];
		}

		int total = 0;
		// 根据data 得到行列式的行数和列数
		int num = data.length;
		// 创建一个大小为num 的数组存放对应的展开行中元素求的的值
		int[] nums = new int[num];

		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				nums[i] = data[0][i] * getHL(getDY(data, 1, i + 1));
			} else {
				nums[i] = -data[0][i] * getHL(getDY(data, 1, i + 1));
			}
		}
		for (int i = 0; i < num; i++) {
			total += nums[i];
		}
		System.out.println("total=" + total);
		return total;
	}

	// 3.求转置矩阵A*
	public static int[][] getA_T(int[][] A) {
		int h = A.length;
		int v = A[0].length;
		// 创建和A行和列相反的转置矩阵
		int[][] A_T = new int[v][h];
		// 根据A取得转置矩阵A_T
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < h; j++) {
				A_T[j][i] = A[i][j];
			}
		}
		System.out.println("取得转置矩阵........");
		return A_T;
	}

	// 3.求逆矩阵
	public static int[][] getN(int[][] data) {
		// 先是求出行列式的模|data|
		int A = getHL(data);
		// 创建一个等容量的逆矩阵
		int[][] newData = new int[data.length][data.length];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				int num;
				if ((i + j) % 2 == 0) {
					num = getHL(getDY(data, i + 1, j + 1));
				} else {
					num = -getHL(getDY(data, i + 1, j + 1));
				}

				newData[i][j] = num / A;
			}
		}
		// 转置 代数余子式转制
		newData = getA_T(newData);
		// 打印
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				System.out.print("newData[" + i + "][" + j + "]= "
						+ newData[i][j] + "   ");
			}
			System.out.println();
		}
		return newData;
	}

	// 2.求二阶行列式
	public static int getHL2(int[][] data) {
		// data 必须是2 * 2 的数组
		int num1 = data[0][0] * data[1][1];
		int num2 = -data[0][1] * data[1][0];
		return num1 + num2;
	}

	// 3.求3阶
	public static int getHL3(int[][] data) {
		int num1 = data[0][0] * getHL2(getDY(data, 1, 1));
		int num2 = -data[0][1] * getHL2(getDY(data, 1, 2));
		int num3 = data[0][2] * getHL2(getDY(data, 1, 3));
		System.out.println("3阶行列式的数值是：----->" + (num1 + num2 + num3));
		return num1 + num2 + num3;
	}

	// 4.求4阶
	public static int getHL4(int[][] data) {
		int num1 = data[0][0] * getHL3(getDY(data, 1, 1));
		int num2 = -data[0][1] * getHL3(getDY(data, 1, 2));
		int num3 = data[0][2] * getHL3(getDY(data, 1, 3));
		int num4 = -data[0][3] * getHL3(getDY(data, 1, 4));

		return num1 + num2 + num3 + num4;
	}

	// 5.求5阶
	public static int getHL5(int[][] data) {

		int num1 = data[0][0] * getHL4(getDY(data, 1, 1));
		int num2 = -data[0][1] * getHL4(getDY(data, 1, 2));
		int num3 = data[0][2] * getHL4(getDY(data, 1, 3));
		int num4 = -data[0][3] * getHL4(getDY(data, 1, 4));
		int num5 = data[0][4] * getHL4(getDY(data, 1, 5));

		System.out.println("5 阶行列式的数值是：  ------->"
				+ (num1 + num2 + num3 + num4 + num5));
		return num1 + num2 + num3 + num4 + num5;
	}

	// 6.求3阶逆矩阵
	/**
	 * 求解3阶矩阵的逆矩阵
	 * 
	 * @param data
	 * @return
	 */
	public static int[][] getN3(int[][] data) {
		// 先是求出整个行列式的数值|A|
		int A = getHL3(data);
		int[][] newData = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int num;
				if ((i + j) % 2 == 0) {// i+j 是偶数 实际是(i+1)+(j+1)
					num = getHL2(getDY(data, i + 1, j + 1));
				} else {
					num = -getHL2(getDY(data, i + 1, j + 1));
				}
				System.out.println("num=" + num);
				newData[i][j] = num / A;
			}
		}
		// 再转置
		newData = getA_T(newData);
		// 打印
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("newData[" + i + "][" + j + "]= "
						+ newData[i][j] + "   ");
			}
			System.out.println();
		}
		return newData;
	}

	public static String arrToString(final int[][] arr) {
		final StringBuilder result = new StringBuilder();
		result.append("\n[\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result.append(arr[i][j]).append(" [i=").append(i).append(",j=")
						.append(j).append("]  , ");
			}
			result.append("\n");
		}
		result.delete(result.length() - 1, result.length());
		result.append("\n]");
		return result.toString();
	}
}
