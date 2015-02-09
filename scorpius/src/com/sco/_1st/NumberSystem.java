package com.sco._1st;
/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name NumberSystem
 * @class com.sco._1st.NumberSystem
 * @date Nov 27, 2014 10:22:33 PM
 * @see
 */
public class NumberSystem {
	public static void main(String args[]){
		//�����ƺ�ʮ�����໥ת��
        int integer = 117;
        String binary = Integer.toBinaryString(integer);
        System.out.println("Binary value of " + integer + " is " + binary);
        String inputBinary = "100010011";
        int bResult = Integer.parseInt(inputBinary,2);
        System.out.println("Integer value of '" + inputBinary + "' is " + bResult);

        //ʮ���ƺͰ˽��Ƶ��໥ת��
        int integer2 = 1024;
        String octal = Integer.toOctalString(integer2);
        System.out.println("Octal value of " + integer2 + " is " + octal);
        String inputOctal = "712364";
        int oResult = Integer.parseInt(inputOctal, 8);
        System.out.println("Integer value of " + inputOctal + " is " + oResult);
        //ʮ���ƺ�ʮ�����Ƶ��໥ת��
        int integer3 = 4096;
        String hex = Integer.toHexString(integer3);
        System.out.println("Hex value of " + integer3 + " is " + hex);
        String inputHex = "FEDD34";
        int hResult = Integer.parseInt(inputHex, 16);
        System.out.println("Integer value of " + inputHex + " is " + hResult);
	}
}
