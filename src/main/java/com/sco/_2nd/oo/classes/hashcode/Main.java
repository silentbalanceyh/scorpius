package com.sco._2nd.oo.classes.hashcode;

import java.io.File;

public class Main {
	public static void main(String args[]) throws Exception{
		File file1 = new File("a");
		File file2 = new File("b");
		File file3 = new File("c");
		
		int ihc1 = System.identityHashCode(file1);
		System.out.println(ihc1);
		int ihc2 = System.identityHashCode(file2);
		System.out.println(ihc2);
		int ihc3 = System.identityHashCode(file3);
		System.out.println(ihc3);
	}
}
