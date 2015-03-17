package com.sco._1st.test;

import static com.sco._1st.test.util.Progress.STARTED;
import static com.sco.lyra.util.Logger.console;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sco._1st.test.util.ArrayUtil;
import com.sco._1st.test.util.NumberUtil;
/**
 * 
 * @author Lang
 * @package com.sco._1st.test
 * @name Chapter01Base
 * @class com.sco._1st.test.Chapter01Base
 * @date Dec 2, 2014 8:25:20 PM
 * @see
 */
class Chapter01Base{
	
	Integer[] function10Result(int inValue){
		console(getClass(),"[Started] CalculateCase.function10.");
		console(getClass(),"[Input] Input Value = " + inValue);
		Integer[] itemArr = NumberUtil.calculateSubvalues(inValue);
		StringBuilder builder = new StringBuilder();
		builder.append(inValue).append(" = ");
		for( int i = 0; i < itemArr.length; i++ ){
			builder.append(itemArr[i]).append(" x ");
		}
		builder.delete(builder.length() - 2, builder.length());
		console(getClass(),"[Output] Expand expression: " + builder);
		console(getClass(),"[Output] Subvalues Result = " + ArrayUtil.toString(itemArr));
		return itemArr;
	}
	
	Integer[] function9Result(int limit){
		console(getClass(),"[Started] CalculateCase.function9.");
		List<Integer> retList = new ArrayList<>();
		console(getClass(),"[Input] limit = " + limit);
		limit = (limit >= 1000)?1000:limit;
		for( int i = 100; i < limit; i++ ){
			if(NumberUtil.isNarcissistic(i)){
				retList.add(i);
			}
		}
		Integer[] itemArr = retList.toArray(new Integer[]{});
		console(getClass(),"[Output] Narcissistic Result = " + ArrayUtil.toString(itemArr));
		return itemArr;
	}
	
	Integer[] function8Result(int limit){
		console(getClass(),"[Started] CalculateCase.function8.");
		List<Integer> retList = new ArrayList<>();
		for( int i = 2; i <= limit; i++ ){
			if(NumberUtil.isPrime(i)){
				retList.add(i);
			}
		}
		Integer[] itemArr = retList.toArray(new Integer[]{});
		console(getClass(),"[Output] Prime Result = " + ArrayUtil.toString(itemArr));
		return itemArr;
	}
	
	int function7Result(){
		console(getClass(),"[Started] CalculateCase.function7.");
		int expected = 0;
		for( int i = 0; i < 100; i++ ){
			if( i % 3 == 1 && i % 7 == 0 && i % 5 == 3){
				expected = i;
			}
		}
		console(getClass(),"[Output] n = " + expected);
		return expected;
	}
	
	BigInteger function1Result(){
		console(getClass(),"[Started] BigIntegerCase.function1.");
		BigInteger x = BigInteger.valueOf(10);
		console(getClass(),"[Input] x = " + x);
		x = x.pow(2);
		BigInteger z = BigInteger.valueOf(6);
		console(getClass(),"[Input] z = " + z);
		z = BigInteger.valueOf(3).pow(6).divide(z);
		final BigInteger expected = z.add(x);
		console(getClass(),"[Output] y = " + expected);
		return expected;
	}
	
	BigInteger function2Result(){
		console(getClass(),"[Started] BigIntegerCase.function2.");
		BigInteger x = BigInteger.valueOf(5);
		BigInteger z = BigInteger.valueOf(4);
		console(getClass(),"[Input]  x = " + x);
		console(getClass(),"[Input]  z = " + z);
		x = x.pow(3).mod(BigInteger.valueOf(6));
		z = z.pow(3);
		final BigInteger expected = x.subtract(z);
		console(getClass(),"[Output] y = " + expected);
		return expected;
	}
	
	BigDecimal function3Result(){
		console(getClass(),"[Started] BigDecimalCase.function3.");
		BigDecimal x = new BigDecimal("3.1415926535");
		console(getClass(),"[Input]  x = " + x);
		final BigDecimal y = x.setScale(3, RoundingMode.HALF_UP);
		console(getClass(),"[Output] y = " + y);
		return y;
	}
	
	BigDecimal function4Result(){
		console(getClass(),"[Started] BigDecimalCase.function4.");
		BigDecimal x = new BigDecimal("-1.6");
		console(getClass(),"[Input]  x = " + x);
		final BigDecimal y = x.setScale(0, RoundingMode.HALF_EVEN);
		console(getClass(),"[Output] y = " + y);
		return y;
	}
	
	long[] function5Result(final String[] inArr){
		console(getClass(),"[Started] ArrayCase.function5.");
		console(getClass(),"[Input]  arr    = " + ArrayUtil.toString(inArr));
		final long[] outArr = ArrayUtil.toLongArray(inArr,'*');
		console(getClass(),"[Output] retArr = " + ArrayUtil.toString(outArr));
		return outArr;
	}
	
	boolean[][] function6Result(final int x[],final int y[]){
		console(getClass(),"[Started] ArrayCase.function6.");
		console(getClass(),"[Input]  x      = " + ArrayUtil.toString(x));
		console(getClass(),"[Input]  y      = " + ArrayUtil.toString(y));
		final boolean[][] outArr = ArrayUtil._5x9(x, y);
		console(getClass(),"[Output] retArr = " + ArrayUtil.toString(outArr));
		return outArr;
	}
	
	int[] genIntArr(int length, int limit){
		final int[] retArr = new int[length];
		final Random random = new Random();
		for( int i = 0; i < length; i++ ){
			retArr[i] = random.nextInt(limit) % (limit + 1);
		}
		return retArr;
	}
	
	String[] genNumberArr(){
		final Random random = new Random();
		int length = 0;
		while(true){
			length = random.nextInt(50);
			if( length > 12 ){
				break;
			}
		}
		final String[] retArr = new String[length];
		for( int i = 0; i < length; i++ ){
			retArr[i] = String.valueOf(random.nextInt(2000));
		}
		return retArr;
	}
	
	<T extends Object> void consoleEnd(final T obj, final String funName){
		console(getClass(),"[End] " + funName + ".");
		if(!STARTED(obj)){
			System.err.println("[End] Please finish your home work.( " + funName + " )");
		}
	}
	
	void success(final String funName){
		final Random random = new Random();
		console(getClass(),"[End] Successful => " + funName + ".\n" + success(random.nextInt(10)));
	}
	
	private String success(final int index){
		final String[] str = new String[]{
			"\u971c\u513f\u771f\u68d2\uff01\u7ee7\u7eed\u52a0\u6cb9\uff01",
			"\u971c\u513f\u80fd\u5e72\uff0c\u505a\u5bf9\u4e86\uff01",
			"\u529f\u592b\u4e0d\u8d1f\u6709\u5fc3\u4eba\uff0c\u518d\u63a5\u518d\u5389\uff0c\u971c\u513f\uff01",
			"\u4f60\u7684\u4ee3\u7801\u6ca1\u6709\u95ee\u9898\u4e86\u971c\u513f\uff0c\u5566\u5566\u5566\u5566\uff01",
			"\u770b\uff0c\u971c\u513f\uff0c\u4f60\u7684\u4ee3\u7801\u628a\u7070\u673a\u6253\u843d\u4e86\uff01",
			"\u64e6\uff0c\u971c\u513f\uff01\u4f60\u592a\u5c4c\u4e86\uff0c\u5c4c\u5f97\u4e0d\u884c\u4e86\u2026\u2026\u2026\u2026",
			"\u54c7\u585e\uff0c\u505a\u5bf9\u4e86\uff01\u6211\u656c\u4f69\u4f60\u7684\u5fc3\u72b9\u5982\u6ed4\u6ed4\u6c5f\u6c34\uff0c\u8fde\u7ef5\u4e0d\u7edd\uff0c\u9ec4\u6cb3\u6cdb\u6ee5\uff0c\u4e00\u53d1\u4e0d\u53ef\u6536\u62fe\uff01",
			"\u971c\u513f\uff0c\u597d\u68d2\uff01\u597d\u68d2\uff01\u597d\u68d2\uff01",
			"\u7d2f\u4e86\u5427\uff0c\u634f\u634f\u80a9\uff0c\u634f\u634f\u80a9\uff0c\u6376\u6376\u80cc\uff0c\u6376\u6376\u80cc\uff01",
			"\u51bb\u7740\u971c\u513f\u7684\u624b\u4e86\u5427\uff0c\u6ca1\u4e8b\u6ca1\u4e8b\uff0c\u7ed9\u4f60\u6696\u6696\u54c8\u53e3\u6c14\uff01"
		};
		return str[index];
	}
}
