package Homework12.JDBC.MyJDBC;

import java.sql.*;

public class MySQL{
    public static void main(String args[]){
        try(
            Connection conn = DriverManager.getConnection(null, null, null);
            Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from student";
            System.out.println("The Sql  statement is :" + strSelect + "\n");

            ResultSet rset = stmt .executeQuery(strSelect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}