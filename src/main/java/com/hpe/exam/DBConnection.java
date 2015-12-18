package com.hpe.exam;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author Lang
 *
 */
public class DBConnection {
    /** **/
    private static DBConnection instance;
    /** **/
    private transient Properties prop;
    /** **/
    private transient String category;
    /** **/
    public static DBConnection getInstance(final String category){
        if(null == instance){
            instance = new DBConnection(category);
        }
        return instance;
    }
    /** **/
    private DBConnection(final String category){
        this.category = category;
        this.prop = this.getDBConfig();
    }
    
    public void debugCfg(){
        if(null != prop){
            System.out.println("jdbc.url = " + prop.getProperty(category + ".jdbc.url"));
            System.out.println("jdbc.driver = " + prop.getProperty(category + ".jdbc.driver"));
            System.out.println("jdbc.username = " + prop.getProperty(category + ".jdbc.username"));
            System.out.println("jdbc.password = " + prop.getProperty(category + ".jdbc.password"));
            System.out.println("jdbc.database.name = " + prop.getProperty(category + ".jdbc.database.name"));
        }
    }

    private Properties getDBConfig(){
        final InputStream istream = getClass().getResourceAsStream("/database.properties");
        final Properties prop = new Properties();
        try {
            prop.load(istream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    
    public static void main(final String args[]){
        final DBConnection mssql = DBConnection.getInstance("MSSQL");
        final DBConnection h2 = DBConnection.getInstance("H2");
        mssql.debugCfg();
        h2.debugCfg();
    }
}
