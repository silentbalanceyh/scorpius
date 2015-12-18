package com.hpe.exam;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 
 * @author Lang
 *
 */
public class Base64Testing {
    // ~ Static Fields =======================================
    // ~ Instance Fields =====================================
    // ~ Static Block ========================================
    // ~ Static Methods ======================================
    // ~ Constructors ========================================
    // ~ Abstract Methods ====================================
    // ~ Override Methods ====================================
    // ~ Methods =============================================
    // ~ Private Methods =====================================
    private static ConcurrentMap<String,String> extract(final String token){
        final ConcurrentMap<String,String> retMap = new ConcurrentHashMap<>();
        final String base64Str = token.split(" ")[1];
        try{
            final Decoder decoder = Base64.getDecoder();
            final String tempStr = new String(decoder.decode(base64Str),"UTF-8");
            final String username = tempStr.split(":")[0];
            final String password = tempStr.split(":")[1];
            retMap.putIfAbsent(username, password);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return retMap;
    }
    
    public static void main(String args[]){
        System.out.println((int)'%');
        final ConcurrentMap<String,String> token = extract("Basic bGFuZy55dTp%wbCxva21pam4xMjM=");
        for(final String key: token.keySet()){
            System.out.println(key + "=" + token.get(key));
        }
    }
    // ~ Get/Set =============================================
    // ~ hashCode,equals,toString ============================

}
