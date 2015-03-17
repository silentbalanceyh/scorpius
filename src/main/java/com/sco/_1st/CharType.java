package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name CharType
 * @class com.sco._1st.CharType
 * @date Nov 26, 2014 7:50:37 PM
 * @see
 */
public class CharType {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		// 1.基本字符
		char unicode = '\u0041';
		char literal = 'A';
		char intVal = (char)65;
		char oIntVal = (char)0101;
		char oxIntVal = (char)0x41;
		// char osintVal = (char)"A";
		System.out.println(unicode);
		System.out.println(literal);
		System.out.println(intVal);
		System.out.println(oIntVal);
		System.out.println(oxIntVal);
		// 2.转义字符
		System.out.println('\n');
		System.out.println('\t');
		System.out.println('\b');
		System.out.println('\r');
		System.out.println('\f');
		System.out.println('\'');
		System.out.println('\"');
		System.out.println('\\');
		System.out.println('\101');
		System.out.println('\u0041');
		// 3.获取十进制的字符数值
		System.out.println((int)'{');
		System.out.println((int)'}');
		System.out.println((int)'[');
		System.out.println((int)']');
		// 4.java.lang.Character
		//Char和整数之间的相互转换
        char ch1 = 'a';
        char ch2 = 66;
        System.out.println("---------------");
        System.out.println("ch1 is " + ch1);
        System.out.println("ch2 is " + ch2);

        //Character里面的方法
        System.out.println("---------------");
        System.out.println("isLowerCase：Z——" + Character.isLowerCase('Z'));
        System.out.println("isUpperCase：A——" + Character.isUpperCase('A'));
        System.out.println("isLetter：A——" + Character.isLetter('A'));
        System.out.println("isLetter：2——" + Character.isLetter('3'));
        System.out.println("isLetterOrDigit：%——" + Character.isLetterOrDigit('%'));
        System.out.println("isDigit：%——" + Character.isDigit('%'));
        System.out.println("isDigit：0——" + Character.isDigit('0'));
        System.out.println("isWhitespace: ' '——" + Character.isWhitespace(' '));
        System.out.println("isWhitespace: A——" + Character.isWhitespace('A'));

        //从字符串里面抽取Char
        System.out.println("---------------");
        String inputValue = "123456";
        System.out.println("Get 3 " + inputValue.charAt(2));
        System.out.println(containsOnlyNumbers("123456"));
        System.out.println(containsOnlyNumbers("123abc456"));
        
        // 5.定义和转换
        Character wrapperChar = Character.valueOf(unicode);
        wrapperChar = unicode;
        wrapperChar = new Character(unicode);
        System.out.println(wrapperChar);
        System.out.println(wrapperChar.charValue()); // JDK 1.4
        System.out.println(Character.MAX_VALUE);
	}
	
	private static boolean containsOnlyNumbers(String str){
        for(int i = 0; i < str.length(); i++ ){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
