package com.sco.daily._201412;

public class CharacterType {

	public final static void main(String args[]){
	
		/*
		 * 基本类型
		 */
		char cCommon = 'A';
		final char cIntA = (char)65;
		final char cInta = (char)97;
		final char cOintA = (char)0101;
		final char cOinta = (char)0141;
		final char cOxintA = (char)0x41;
		final char cOxinta = (char)0x61;
		char uUnicodeA = '\u0041';
		char uUnicodea = '\u0061';
		System.out.println("A:" + cCommon);
		System.out.println("Decimal:	A:" + cIntA + "	a:" + cInta);
		System.out.println("OCT:	A:" + cOintA + "	a:" + cOinta);
		System.out.println("hexadecimal:	A:" + cOxintA + "	a:" + cOxinta);
		System.out.println("UnicodeA:	" + uUnicodeA);
		System.out.println("Unicodea:	" + uUnicodea);
		
		/*
		 * 转义字符
		 */
		char uReturn = '\u0010';
		char uTAB = '\u0009';
		char uNull = '\u0008';
		char uLineFeed = '\u0013';
		char uSkip = '\u0012';
	//	' : 39 0x27
	//	char uSingle = '\u0027';
		char uDouble = '\u0022';
	//	char uBlackslash = '\u005c';
		
		System.out.println("回车：" + '\n' + uReturn + "end");
		System.out.println("制表符：" + '\t' + uTAB + "end");
		System.out.println("空白：" + '\b' + uNull + "end");
		System.out.println("换行:" + '\r' + uLineFeed + "end");
		System.out.println("换页：" + '\f' + uSkip + "end");
		System.out.println("双引号:" + '\"' + uDouble + "end");
		
		/*
		 * Character API
		 */
		Character uUnicode = '\u0041';
	
	//	Character cValue = Character.valueOf(uUnicode);
		Character cValue;
		cValue = new Character(uUnicode);
		System.out.println(cValue);
		System.out.println(cValue.charValue());
		
		System.out.println(Character.charCount('A'));
		char[] arrU = new char[]{'\u0061', '\u0063', '\u0062','\u0063' };
		System.out.println(Character.codePointAt(arrU, 1)); 	// 居然是ASCII O_O
		System.out.println(Character.codePointBefore(arrU, 1));
	//	System.out.println(Character.codePointCount(arrU, 1, 3)); //JDK 1.5  T_T 神马返回值
		
		System.out.println("compare 'a', 'A':");
		System.out.println(Character.compare('a', 'A'));	//JDK 1.7
		System.out.println(Character.valueOf('A').compareTo(Character.valueOf('a')));
		
	//	System.out.println(Character.digit(0x0034, 4));
		
		System.out.println("isAlpabetic:");
		System.out.println(Character.isAlphabetic(100));
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isAlphabetic('哈'));
		
		System.out.println("isDefined：");
		System.out.println(Character.isDefined('*'));
		System.out.println(Character.isDefined('`'));
		System.out.println(Character.isDefined('C'));
		
		System.out.println("isDigit: ");
		System.out.println(Character.isDigit('0'));
		System.out.println(Character.isDigit(100));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('#'));
		
		System.out.println("isLetter: ");
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('$'));
		System.out.println(Character.isLetter('9'));
		
		System.out.println("isLetterOrDigit:");
		System.out.println(Character.isLetterOrDigit('9'));
		System.out.println(Character.isLetterOrDigit('j'));
		System.out.println(Character.isLetterOrDigit('$'));
		
		System.out.println("isLowerCase:");
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('z'));
		System.out.println(Character.isLowerCase('z'));
		
		Character[] cArr = new Character[]{'a', 'b', 'c'}; 
		System.out.println(charToString(cArr));
		String strString = "defg";
		Character[] cSToArr = new Character[strString.length()];
		cSToArr = stringToCharacter(strString);
		for(int i =0; i < cSToArr.length; i++){
			System.out.println(cSToArr[i]);
		}	
		
		System.out.println("isLegal:");
		System.out.println(isLegal("AAAA"));
		System.out.println(isLegal("哈哈"));
		System.out.println(isLegal("8JDK"));
		System.out.println(isLegal("*****"));
		System.out.println(isLegal("_$***"));
	}
	
	 public static String charToString(Character[] cArr){
		 String strReturn = "";
		 int iLength = cArr.length;
		 for(int i = 0; i < iLength; i++){
			 strReturn = strReturn + Character.toString(cArr[i]);
		 }	 	 
		return strReturn;		 
	 }
	 
	 public static Character[] stringToCharacter(String strString){
		 
		 int iLength = strString.length();
		 Character[] cArr = new Character[iLength];
		 
		 for(int i = 0; i < iLength; i++){
			 cArr[i] = strString.charAt(i);
		 }
		return cArr; 
	 }
	 
	 public static boolean isLegal(String strIdentifier){
		 
		 int iLength = strIdentifier.length();
		 char cCharacter = strIdentifier.charAt(0);
		 if(Character.isDigit(cCharacter))
			 return false;
		 for(int i = 0; i < iLength; i++){
			 cCharacter = strIdentifier.charAt(i);
			 if(Character.isLetterOrDigit(cCharacter) || cCharacter == '_' || cCharacter == '$'){
				 return true;
			 }
		 }
		return false;	 
	 }		
}
