package com.sco.java2s.dt.box;
/**
 * 
 * @author Lang
 * @package com.sco.java2s.dt.box
 * @name AutoBox4
 * @class com.sco.java2s.dt.box.AutoBox4
 * @date Nov 26, 2014 9:17:32 PM
 * @see
 */
public class AutoBox4 {

	public static void main(String[] args) {
		Integer iObj = 100;
		Double dOb = 98.6;
		
		dOb = dOb + iObj;
		System.out.println("dOb after expression: " + dOb);
	}

}
