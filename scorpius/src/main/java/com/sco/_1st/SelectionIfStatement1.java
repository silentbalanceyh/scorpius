package com.sco._1st;

import java.util.Random;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SelectionIfStatement1
 * @class com.sco._1st.SelectionIfStatement1
 * @date Dec 6, 2014 11:08:19 PM
 * @see
 */
public class SelectionIfStatement1 {
	public static void main(String args[]){
        Random random = new Random();
        int result = random.nextInt(3);
        if( result == 2){
            System.out.print("This is if block,");
            System.out.println("Test block flow.");
        }
        if( result == 1)
            System.out.println("This is if single flow.");
            System.out.println("This is Inner or Outer."); //这句的写法是故意的
        System.out.println("Main flow.");
    }
}
