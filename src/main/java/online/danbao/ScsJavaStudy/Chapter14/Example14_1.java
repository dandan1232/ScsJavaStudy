/*
package online.danbao.ScsJavaStudy.Chapter14;

import java.sql.*;

*/
/**
 * @author: 蛋宝
 * @date: 2022/10/25 11:13
 * @description:书上代码p395，连接数据库
 *//*

public class Example14_1 {
    public static void main(String[] args) {
        Connection con=null;
        Statement sql;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e){
            System.out.println(e);
        }
        String url = "jdbc://mysql://localhost:3306/?library_system" +
                "useSSL=false&serverTimezone=CST&characterEncoding=utf-8";
        String user = "root";
        String password = "ldd123789dd";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            sql = con.createStatement();
            rs=sql.executeQuery("SELECT * FROM librarty_system");
            while (rs.next()) {
                String number = rs.getString(1);
                String name = rs.getString(2);
                float price = rs.getFloat(3);
                Date date = rs.getDate(4);
                System.out.printf("%s,%s,%.2f,%s\n", number, name, price, date);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}*/
