package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpCommaCall
 * @class com.sco._1st.OpCommaCall
 * @date 2014年12月15日 下午12:00:17
 * @see
 */
public class OpCommaCall {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int a = 1, b = 4, c = 7;
		int d, e, f;
		for (int i = 0, j = 0; j < 10; i++) {
			j = i + 2;
			System.out.println(j);
		}

		int[] arr = new int[] { 12, 34, 45, 66 };
	}

	public static <K, V, E> void print(final K kValue, final V vValue,
			final E eValue) {
		System.out.println(kValue);
		System.out.println(vValue);
		System.out.println(eValue);
	}
}
