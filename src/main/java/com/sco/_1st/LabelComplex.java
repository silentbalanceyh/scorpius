package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name LabelComplex
 * @class com.sco._1st.LabelComplex
 * @date Dec 11, 2014 4:15:31 PM
 * @see
 */
public class LabelComplex {
	public static void main(String args[]){
		outer:for(int i=1; i < 4; i++){
            inner:for(int j =0; j < 5; j++){
            if( j == 2 )
                continue inner;
            System.out.println("i + j = " + (i+j));
            if( j == 4)
                break outer;
            }
        }
        other:for(int i = 0; i < 4; i++){
            if( i == 3){
                break other;
            }
            System.out.println("i = " + i);
        }
	}
}
