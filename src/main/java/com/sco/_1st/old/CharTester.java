package com.sco._1st.old;

public class CharTester {
	public static void main(String args[]){
		//Char和整数之间的相互转换
		char ch1 = 'a';
		char ch2 = 66;
		System.out.println("---------------");
		System.out.println("ch1 is " + ch1);
		System.out.println("ch2 is " + ch2);
		//Character里面的方法
		System.out.println("---------------");
		System.out.println("isLowerCase: Z——" + Character.isLowerCase('Z'));
		System.out.println("isUpperCase: A——" + Character.isUpperCase('A'));
		System.out.println("isLetter: A——" + Character.isLetter('A'));
		System.out.println("isLetter: 2——" + Character.isLetter('3'));
		System.out.println("isLetterOrDigit: %——" + Character.isLetterOrDigit('%'));
		System.out.println("isDigit: %——" + Character.isDigit('%'));
		System.out.println("isDigit: 0——" + Character.isDigit('0'));
		System.out.println("isWhitespace: ' '——" + Character.isWhitespace(' '));
		System.out.println("isWhitespace: A——" + Character.isWhitespace('A'));
		
		//从字符串里面抽取Char
		System.out.println("---------------");
		String inputValue = "123456";
		System.out.println("Get 3 " + inputValue.charAt(2));
		System.out.println(containsOnlyNumbers("123456"));
		System.out.println(containsOnlyNumbers("123abc456"));
	}
	
	//检测某个字符串是否全部是数字
	private static boolean containsOnlyNumbers(String str){
		for(int i = 0; i < str.length(); i++ ){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
}
