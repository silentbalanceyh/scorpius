package com.sco._1st.old;

import java.text.DecimalFormat;

public class NumberFormatMain {
	public static void main(String args[]){
		System.out.println(new DecimalFormat("0.00").format(4.025));
		System.out.println(new DecimalFormat("0.00").format(4.024));
	}
}
