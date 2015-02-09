package com.sco._1st.test;
//import static com.sco._1st.test.util.Progress.NOT_START;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 
 * @author Lang
 * @package com.sco._1st.test
 * @name BigDecimalCase
 * @class com.sco._1st.test.BigDecimalCase
 * @date Dec 2, 2014 9:04:06 PM
 * @see
 */
public class BigDecimalCase {
	/**
	 * Rounding.HALF_UP
	 * @param inputValue
	 * @return
	 */
	public BigDecimal function3(final double input){
		// FINISH: 1-3.写一个四舍五入的算法
		BigDecimal bigValue = new BigDecimal(input);
		BigDecimal bigReturn = bigValue.setScale(3, RoundingMode.HALF_UP);
		
		return bigReturn;	//NOT_START();
	//	return NOT_START();
	}
	/**
	 * Rounding.HALF_EVEN
	 * @param inputValue
	 * @return
	 */
	public BigDecimal function4(final String inputValue){
		// FINISH: 1-4.写一个“银行家舍入算法”
		BigDecimal bigValue = new BigDecimal(inputValue);
		BigDecimal bigReturn = bigValue.setScale(0, RoundingMode.HALF_EVEN);
		return bigReturn;	//NOT_START();
	}
}
