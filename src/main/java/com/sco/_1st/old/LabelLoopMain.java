package com.sco._1st.old;

public class LabelLoopMain {
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
