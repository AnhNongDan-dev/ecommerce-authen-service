package com.ecommerce.authen;

import java.sql.*;

public class TestOracleConnection {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ecommerce", "authen", "123456");
        System.out.println("Connected: " + !conn.isClosed());
        conn.close();
    }
}
