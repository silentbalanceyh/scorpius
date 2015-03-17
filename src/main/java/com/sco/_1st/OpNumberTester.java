package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name OpNumberTester
 * @class com.sco._1st.OpNumberTester
 * @date Dec 18, 2014 3:26:05 PM
 * @see
 */
public class OpNumberTester {
	public static void main(String args[]){
        int a = 2;
        int b = 4;
        int c = 3;
        int result = c + b / a;
        System.out.println("c + b / a = " + result);
        result = c * b / a;
        System.out.println("c * b / a = " + result);

        double b1 = 4.5f;
        double a1 = 2;
        double result1 = b1 % a1;
        System.out.println(" b % c = " + (b % c));
        System.out.println(" b1 % a1 = " + result1);
	}
}
