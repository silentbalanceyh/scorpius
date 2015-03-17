package com.sco._1st;

import java.util.Random;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name SelectionMulti
 * @class com.sco._1st.SelectionMulti
 * @date Dec 6, 2014 11:45:58 PM
 * @see
 */
public class SelectionMulti {
	public static void main(String args[]) {
		Random random = new Random();
		int i = random.nextInt(5) + 1;
		if (i == 1) {
			System.out.println("First!");
		} else if (i == 2) {
			System.out.println("Second!");
		} else if (i == 3) {
			System.out.println("Third!");
		} else if (i == 4) {
			System.out.println("Forth!");
		} else if (i == 5) {
			System.out.println("Fifth!");
		} else {
			System.out.println("Other!");
		}

		switch (i) {
		case 1:
			System.out.println("First");
			break;
		case 2:
			System.out.println("Second");
			break;
		case 3:
			System.out.println("Third");
			break;
		case 4:
			System.out.println("Forth");
			break;
		case 5:
			System.out.println("Fifth");
			break;
		default:
			System.out.println("Other!");
			break;
		}
	}
}
