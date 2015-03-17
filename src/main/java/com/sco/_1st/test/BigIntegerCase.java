package com.sco._1st.test;

//import static com.sco._1st.test.util.Progress.NOT_START;

import java.math.BigInteger;

/**
 * 
 * @author Lang
 * @package com.sco._1st.test
 * @name BigIntegerCase
 * @class com.sco._1st.test.BigIntegerCase
 * @date Dec 2, 2014 8:00:40 PM
 * @see
 */
public class BigIntegerCase {
	/**
	 * y = x^2 + ( 3 ^ 6 ) / z;
	 * @param leftValue
	 * @param rightValue
	 * @return
	 */
	public BigInteger function1(final String x,
			int z) {
		// FINISH: 1-1.完成公式：y = x ^ 2 + ( 3 ^ 6 ) / z;
		BigInteger bigX = new BigInteger(x);
		BigInteger bigMultply;
	//	bigMultply = bigX.multiply(bigX);
		bigMultply = bigX.pow(2);
		int iAdd;
		iAdd = (int)Math.pow(3, 6) / z;
		BigInteger bigAdd = new BigInteger(Long.toString(iAdd));
	//	BigInteger bigAdd = BigInteger.valueOf(3).pow(6).divide(BigInteger.valueOf(z));
		BigInteger bigReturn;
		bigReturn = bigMultply.add(bigAdd);
		
		return bigReturn;	//NOT_START();
	}
	/**
	 * y = x^-3 * z^3;
	 * @param x
	 * @param z
	 * @return
	 */
	public BigInteger function2(final int x,
			int z) {
		// FINISH: 1-2.完成公式：y = x^3 % 6 -z^3;		
		BigInteger bigX3 = BigInteger.valueOf(x).pow(Math.abs(-3)).mod(BigInteger.valueOf(6));
		BigInteger bigz3 = BigInteger.valueOf(z).pow(3);
		BigInteger bigSubtract = bigX3.subtract(bigz3);
		
		return bigSubtract;
	//	return NOT_START();
	}
}
