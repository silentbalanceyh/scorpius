package com.sco.lyra;

public class FBTester {
	
	public static void main(String args[]){
		for( int i = 0; i < 21; i++ ){
			System.out.println(fb(i) + " : " + Math.pow(2, i));
		}
	}
	
	private static int fb(int i){
		if( i == 0 ){
			return 0;
		}else if( i == 1){
			return 1;
		}else{
			return fb(i - 1) + fb(i - 2);
		}
	}
}
