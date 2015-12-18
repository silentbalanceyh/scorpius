package com.hpe.exam;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author Lang
 *
 */
public class JdbcTesting {
    // ~ Static Fields =======================================
    // ~ Instance Fields =====================================
    // ~ Static Block ========================================
    public static Properties getDBConfig() {
        final InputStream istream = JdbcTesting.class.getResourceAsStream("/database.properties");
        final Properties prop = new Properties();
        try {
            prop.load(istream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    // ~ Static Methods ======================================

    public static void main(final String args[]) {
        final Properties prop = getDBConfig();
        try {
            // Load Driver
            Class.forName(prop.getProperty("MSSQL.jdbc.driver"));
            // Create Connection
            final Connection conn = DriverManager.getConnection(prop.getProperty("MSSQL.jdbc.url"),
                    prop.getProperty("MSSQL.jdbc.username"), prop.getProperty("MSSQL.jdbc.password"));
            System.out.println("Success to connect ! Connection = " + conn);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    // ~ Constructors ========================================
    // ~ Abstract Methods ====================================
    // ~ Override Methods ====================================
    // ~ Methods =============================================
    // ~ Private Methods =====================================
    // ~ Get/Set =============================================
    // ~ hashCode,equals,toString ============================

}
