package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpDotCall
 * @class com.sco._1st.OpDotCall
 * @date 2014年12月15日 上午9:08:30
 * @see
 */
public class OpDotCall {
	
	private int a;
	
	public void printHello(){
		System.out.println("Hello! Your a is: " + getA());
	}
	
	public int getA(){
		return this.a;
	}
	
	public static void main(String args[]){
		// 1.点操作符
		OpDotCall opDot = new OpDotCall();
		opDot.a = 12; // 成员引用
		opDot.printHello(); // 成员调用
		// 2.链式调用
		final StringBuilder builder = new StringBuilder();
		builder.append("Hello ").append("World ").append('!').append("Lang Yu");
	}
}
