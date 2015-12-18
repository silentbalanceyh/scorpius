package com.hpe.exam;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServerScanner {
    // ~ Static Fields =======================================
    // ~ Instance Fields =====================================
    // ~ Static Block ========================================
    // ~ Static Methods ======================================
    public static Properties getServerConfig() {
        final InputStream istream = JdbcTesting.class.getResourceAsStream("/servers.properties");
        final Properties prop = new Properties();
        try {
            prop.load(istream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    
    public static void main(final String args[]) {
        final Properties prop = getServerConfig();
        for(final Object key: prop.keySet()){
            if(null != key){
                boolean ret = checkServer(prop.getProperty(key.toString()));
                if(!ret){
                    break;
                }
            }
        }
    }
    
    private static boolean checkServer(final String serverInfo){
        final String[] segment = serverInfo.split("\\.");
        final StringBuilder url = new StringBuilder();
        url.append(segment[0]).append("://").append(segment[1]).append(":").append(segment[2]);
        return checkConnection(url.toString());
    }

    private static boolean checkConnection(final String url) {
        System.out.println(url);
        return true;
    }
    // ~ Constructors ========================================
    // ~ Abstract Methods ====================================
    // ~ Override Methods ====================================
    // ~ Methods =============================================
    // ~ Private Methods =====================================
    // ~ Get/Set =============================================
    // ~ hashCode,equals,toString ============================

}
