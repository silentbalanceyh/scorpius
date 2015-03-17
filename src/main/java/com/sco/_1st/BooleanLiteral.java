package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name BooleanLiteral
 * @class com.sco._1st.BooleanLiteral
 * @date 2014年12月5日 上午8:29:14
 * @see
 */
public class BooleanLiteral {
	private static String[] F_DIGIT = {"T","t"};
	private static String[] S_DIGIT = {"R","r"};
	private static String[] T_DIGIT = {"U","u"};
	private static String[] FO_DIGIT = {"E","e"};
	public static void main(String args[]){
		for(final String first: F_DIGIT){
			for(final String second: S_DIGIT){
				for(final String third: T_DIGIT){
					for(final String forth: FO_DIGIT){
						final StringBuilder literal = new StringBuilder();
						literal.append(first).append(second).append(third).append(forth);
						System.out.println("Literal: " + literal + ", Value: " + new Boolean(literal.toString()));
					}
				}
			}
		}
	}
}
