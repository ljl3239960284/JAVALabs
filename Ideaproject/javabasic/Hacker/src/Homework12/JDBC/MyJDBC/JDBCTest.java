package Homework12.JDBC.MyJDBC;

import java.sql.*;


public class JDBCTest {
        public static void main(String[] args) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "";
            String userName = "";
            String password = "";

            Connection conn = DriverManager.getConnection(url,userName,password);

            String sql = "";

            Statement stmt = conn.createStatement();
        }
}
