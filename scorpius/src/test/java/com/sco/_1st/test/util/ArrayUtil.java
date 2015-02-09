package com.sco._1st.test.util;

/**
 * 
 * @author Lang
 * @package com.sco._1st.test.util
 * @name ArrayUtil
 * @class com.sco._1st.test.util.ArrayUtil
 * @date Dec 3, 2014 1:33:29 AM
 * @see
 */
public class ArrayUtil {
	/**
	 * 
	 * @param input
	 * @param operator
	 * @return
	 */
	public static long[] toLongArray(final String[] input, final char operator) {
		final int length = input.length;
		final long[] retArr = new long[length];
		for (int i = 0; i < input.length; i++) {
			switch (operator) {
			case '+':
				retArr[i] = calculateElement(input[i]) + 2;
				break;
			case '-':
				retArr[i] = calculateElement(input[i]) - 2;
				break;
			case '*':
				retArr[i] = calculateElement(input[i]) * 2;
				break;
			case '/':
				retArr[i] = calculateElement(input[i]) / 2;
				break;
			default:
				break;
			}
		}
		return retArr;
	}
	/**
	 * 
	 * @param itemArr
	 * @return
	 */
	public static <T extends Object> String toString(final T[] itemArr){
		final StringBuilder result = new StringBuilder();
		result.append('[');
		for(final T item: itemArr){
			result.append(item).append(',');
		}
		result.delete(result.length() - 1, result.length());
		result.append(']');
		return result.toString();
	}
	/**
	 * 
	 * @param itemArr
	 * @return
	 */
	public static String toString(final long[] itemArr){
		final StringBuilder result = new StringBuilder();
		result.append('[');
		for(final long item: itemArr){
			result.append(item).append(',');
		}
		result.delete(result.length() - 1, result.length());
		result.append(']');
		return result.toString();
	}
	
	public static String toString(final int[] itemArr){
		final StringBuilder result = new StringBuilder();
		result.append('[');
		for(final int item: itemArr){
			result.append(item).append(',');
		}
		result.delete(result.length() - 1, result.length());
		result.append(']');
		return result.toString();
	}

	private static long calculateElement(final String element) {
		long retValue = -1L;
		try {
			retValue = Long.parseLong(element);
		} catch (NumberFormatException ex) {
			retValue = 0L;
		}
		return retValue;
	}
	
	public static String toString(final boolean[][] arr){
		final StringBuilder result = new StringBuilder();
		result.append("\n[\n");
		int i = 0;
		for( boolean[] row: arr){
			for( int j = 0; j < row.length; j++ ){
				if(arr[i][j]){
					result.append(arr[i][j]).append(" [x=").append(i).append(",y=").append(j).append("]  , ");
				}else{
					result.append(arr[i][j]).append("[x=").append(i).append(",y=").append(j).append("]  , ");
				}
			}
			result.append("\n");
			i++;
		}
		result.delete(result.length() - 1, result.length());
		result.append("\n]");
		return result.toString();
	}
	
	public static boolean[][] _5x9(final int[] x, final int[] y){
		boolean[][] ret = new boolean[5][9];
		// set true;
		int length = ret.length;
		for( int i = 0; i < length; i++ ){
			for( int j = 0; j < ret[i].length; j++ ){
				ret[i][j] = true;
			}
		}
		if(x.length == y.length){
			for(int i = 0; i < x.length; i++ ){
				final boolean isIn = isInArray(ret,x[i],y[i]);
				if(isIn){
					ret[x[i]][y[i]] = false;
				}else{
					// 越界
					ret = new boolean[3][7];
					length = ret.length;
					for( int m = 0; m < length; m++ ){
						for( int j = 0; j < ret[m].length; j++ ){
							ret[m][j] = true;
						}
					}
					break;
				}
			}
		}else{
			// 长度变化
			ret = new boolean[4][5];
			length = ret.length;
			for( int i = 0; i < length; i++ ){
				for( int j = 0; j < ret[i].length; j++ ){
					ret[i][j] = false;
				}
			}
		}
		return ret;
	}
	
	private static boolean isInArray(final boolean[][] arr,final int x, final int y){
		boolean ret = false;
		final int length = arr.length;
		int max = 0;
		for( int i = 0; i < length; i++ ){
			max = Math.max(arr[i].length,max);
		}
		
		ret = ( 0 <= x ) && ( x < arr.length ) && ( 0 <= y ) && ( y < max );
		// System.out.println("x=" +x + ",y="+y + ",arr.length=" + length + ",max=" + max + ",ret=" + ret);
		return ret;
	}
}
