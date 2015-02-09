package com.sco._1st.test;
import static com.sco._1st.test.util.Progress.STARTED;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Lang
 * @package com.sco._1st.test
 * @name CalculateTestCase
 * @class com.sco._1st.test.CalculateTestCase
 * @date Dec 7, 2014 9:43:05 AM
 * @see
 */
public class CalculateTestCase extends Chapter01Base{
	/**
	 * 计算n
	 */
	@Test
	public void testN(){
		CalculateCase calculator = new CalculateCase();
		Integer actual = calculator.calculateN();
		Integer expected = function7Result();
		if(STARTED(actual)){
			assertEquals("[Error] 结果出错！！!",expected,actual);
			success("CalculateCase.function7.");
		}
		consoleEnd(actual,"CalculateCase.function7.");
	}
	
	@Test
	public void testPrime(){
		CalculateCase calculator = new CalculateCase();
		Integer[] actual = calculator.calculatePrime(1000);
		Integer[] expected = function8Result(1000);
		if(STARTED(actual)){
			Assert.assertArrayEquals(expected,actual);
			success("CalculateCase.function8.");
		}
		consoleEnd(actual,"CalculateCase.function8.");
	}
	
	@Test
	public void testNarcissistic(){
		CalculateCase calculator = new CalculateCase();
		Integer[] actual = calculator.calculateNarcissistic(2567);
		Integer[] expected = function9Result(2567);
		if(STARTED(actual)){
			Assert.assertArrayEquals(expected,actual);
			success("CalculateCase.function9.");
		}
		consoleEnd(actual,"CalculateCase.function9.");
	}
	
	@Test
	public void testSubvalues(){
		CalculateCase calculator = new CalculateCase();
		Integer[] actual = calculator.calculateExpand(9000);
		Integer[] expected = function10Result(9000);
		if(STARTED(actual)){
			Assert.assertArrayEquals(expected,actual);
			success("CalculateCase.function10.");
		}
		consoleEnd(actual,"CalculateCase.function10.");
	}
}
