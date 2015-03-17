package com.sco._1st;

import java.util.Random;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SelectionIfElsStatement
 * @class com.sco._1st.SelectionIfElsStatement
 * @date Dec 6, 2014 11:29:56 PM
 * @see
 */
public class SelectionIfElsStatement {
	public static void main(String args[])
	{
		// 1.二选一
		int a = 12;
		if( a > 12){
			System.out.println("Bigger than target!");
		}else{
			System.out.println("Less than or equal to target!");
		}
		// 2.多选一
		Random random = new Random();
        int result = random.nextInt(3);
        if( result == 2){
            System.out.print("This is if block,");
            System.out.println("Test block flow.");
        }else if( result == 1){
            System.out.println("This is if single flow.");
            System.out.println("This is Inner or Outer."); 
        }else {
            System.out.print("This is other flow.");
            System.out.println("This is single else flow."); 
        }
        System.out.println("Main flow.");
	}
}
