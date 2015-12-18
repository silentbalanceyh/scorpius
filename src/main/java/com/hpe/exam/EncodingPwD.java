package com.hpe.exam;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EncodingPwD {
    // ~ Static Fields =======================================
    // ~ Instance Fields =====================================
    // ~ Static Block ========================================
    // ~ Static Methods ======================================
    public static Properties getServerConfig() {
        final InputStream istream = JdbcTesting.class.getResourceAsStream("/cn.properties");
        final Properties prop = new Properties();
        try {
            prop.load(istream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    
    public static void main(final String[] args){
        final Properties prop = getServerConfig();
        System.out.println(prop.getProperty("server.pwd"));
    }
    // ~ Constructors ========================================
    // ~ Abstract Methods ====================================
    // ~ Override Methods ====================================
    // ~ Methods =============================================
    // ~ Private Methods =====================================
    // ~ Get/Set =============================================
    // ~ hashCode,equals,toString ============================

}
