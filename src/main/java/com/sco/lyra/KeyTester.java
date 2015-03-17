package com.sco.lyra;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
/**
 * 
 * @author Lang
 * @package com.sco.lyra
 * @name KeyTester
 * @class com.sco.lyra.KeyTester
 * @date Dec 2, 2014 3:11:21 PM
 * @see
 */
public class KeyTester {
	public static void main(String[] args) throws Exception {
		// byte[] _key = null;
		// byte[] _data =null;
		String data = "3AA7D3E2-75D0-4DF3-A1A7-EEA707AF19BB";
		String _str = "itil";
		String _expected = "ffaadcddb0995f26";
		System.out.println("Expected: ");
		for(int i = 0; i < _expected.getBytes().length; i++ ){
			System.out.print(_expected.getBytes()[i] + ",");
		}
		System.out.println();
		System.out.println("UTF-8: ");
		for(int i = 0; i < _expected.getBytes().length; i++ ){
			System.out.print(_expected.getBytes("GBK")[i] + ",");
		}
		System.out.println();
		byte[] encodedata = null;
		// System.out.println("data=" + new String(_str.getBytes()));
		encodedata = encodeECB(data.getBytes(), _str.getBytes());
		System.out.println("Encoded: ");
		for(int i = 0; i < encodedata.length; i++ ){
			System.out.print(encodedata[i] + ",");
		}
		System.out.println();
		System.out.println("encodedata=" + new String(encodedata));

		byte[] decodedata = null;
		// decodedata =decodeECB(data.getBytes("ASCII"),encodedata);
		decodedata = decodeECB(data.getBytes(), encodedata);
		System.out.println("decodedata=" + new String(decodedata));
		System.out.print("\n");
	}

	public static byte[] encodeECB(byte[] _key, byte[] _data) throws Exception {

		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(_key);
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("DESede");
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance("desede" + "/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, deskey);
		byte[] bOut = cipher.doFinal(_data);
		return bOut;
	}

	public static byte[] decodeECB(byte[] _key, byte[] _data) throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(_key);
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("DESede");
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance("desede" + "/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, deskey);
		byte[] bOut = cipher.doFinal(_data);
		return bOut;
	}
}
