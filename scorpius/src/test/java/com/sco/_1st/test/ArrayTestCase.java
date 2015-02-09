package com.sco._1st.test;

import static com.sco._1st.test.util.Progress.STARTED;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTestCase extends Chapter01Base{
	/**
	 * 将数组翻倍
	 * @return
	 */
	@Test
	public void testFirst(){
		ArrayCase function5 = new ArrayCase();
		final String[] inputStrArr = genNumberArr();
		long[] actual = function5.function5(inputStrArr);
		long[] expected = function5Result(inputStrArr);
		if(STARTED(actual)){
			Assert.assertArrayEquals(expected,actual);
			success("ArrayCase,function5");
		}
		consoleEnd(actual,"ArrayCase,function5");
	}
	
	@Test
	public void testSecond(){
		ArrayCase function6 = new ArrayCase();
		int[] x = genIntArr(12,4);
		int[] y = genIntArr(12,8);
		boolean[][] actual = function6.function5x9(x, y);
		boolean[][] expected = function6Result(x, y);
		if(STARTED(actual)){
			Assert.assertArrayEquals(expected,actual);
			success("ArrayCase,function6 case1");
		}
		consoleEnd(actual,"ArrayCase,function6 case1");
	}
	
	@Test
	public void testThird(){
		ArrayCase function6 = new ArrayCase();
		int[] x = genIntArr(11,4);
		int[] y = genIntArr(12,8);
		boolean[][] actual = function6.function5x9(x, y);
		boolean[][] expected = function6Result(x, y);
		if(STARTED(actual)){
			Assert.assertArrayEquals(expected,actual);
			success("ArrayCase,function6 case2");
		}
		consoleEnd(actual,"ArrayCase,function6 case2");
	}
	
	@Test
	public void testForth(){
		ArrayCase function6 = new ArrayCase();
		int[] x = {10,11,4,10,8,1,11,5,0,5,4,6};//genIntArr(12,12);
		int[] y = {3,5,3,4,5,10,10,15,12,3,0,15};// genIntArr(12,17);
		boolean[][] actual = function6.function5x9(x, y);
		boolean[][] expected = function6Result(x, y);
		if(STARTED(actual)){
			Assert.assertArrayEquals(expected,actual);
			success("ArrayCase,function6 case3");
		}
		consoleEnd(actual,"ArrayCase,function6 case3");
	}
}
