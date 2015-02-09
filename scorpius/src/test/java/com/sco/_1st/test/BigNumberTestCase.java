package com.sco._1st.test;
import static com.sco._1st.test.util.Progress.STARTED;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * 
 * @author Lang
 * @package com.sco._1st.test
 * @name BigNumberTestCase
 * @class com.sco._1st.test.BigNumberTestCase
 * @date Dec 2, 2014 8:10:10 PM
 * @see
 */
public class BigNumberTestCase extends Chapter01Base{
	/**
	 * y = x^2 + ( 3 ^ 6 ) / z;
	 * @return
	 */
	@Test
	public void testFirst(){
		BigIntegerCase function1 = new BigIntegerCase();
		BigInteger actual = function1.function1("10", 6);
		BigInteger expected = function1Result();
		if(STARTED(actual)){
			assertEquals("[Error] 结果出错!!!",expected,actual);
			success("BigIntegerCase,function1");
		}
		consoleEnd(actual,"BigIntegerCase.function1");
	}
	/**
	 * y = ( x * 3 % 6 ) - z^3;
	 */
	@Test
	public void testSecond(){
		BigIntegerCase function2 = new BigIntegerCase();
		BigInteger actual = function2.function2(5, 4);
		BigInteger expected = function2Result();
		if(STARTED(actual)){
			assertEquals("[Error] 结果出错!!!",expected,actual);
			success("BigIntegerCase,function2");
		}
		consoleEnd(actual,"BigIntegerCase.function2");
	}
	
	@Test
	public void testThird(){
		BigDecimalCase function3 = new BigDecimalCase();
		BigDecimal actual = function3.function3(3.1415926);
		BigDecimal expected = function3Result();
		if(STARTED(actual)){
			assertEquals("[Error] 结果出错!!!",expected,actual);
			success("BigDecimalCase.function3");
		}
		consoleEnd(actual,"BigDecimalCase.function3");
	}
	
	@Test
	public void testForth(){
		BigDecimalCase function4 = new BigDecimalCase();
		BigDecimal actual = function4.function4("-1.6");
		BigDecimal expected = function4Result();
		if(STARTED(actual)){
			assertEquals("[Error] 结果出错!!!",expected,actual);
			success("BigDecimalCase.function4");
		}
		consoleEnd(actual,"BigDecimalCase.function4");
	}
}
