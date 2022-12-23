package online.danbao.Exam.Exam9.Exchange;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * @author: 蛋宝
 * @date: 2022/12/15 9:58
 * @description:
 */
public class DbListener implements ActionListener {
    WindowsMenu2 win2;

    JTextField text1;
    JTextField text2;

    public void setWin2(WindowsMenu2 win2) {
        this.win2 = win2;
    }

    public void setUid(JTextField t ){
        t =text1;
    }
    public void setpd(JTextField t){
        t=text2;
    }

    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3306/scsstudy?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
    Connection con;
    Statement stmt;

    // 数据库的用户名与密码，需要根据自己的设置
    String USER = "root";
    String PASS = "ldd123789dd";
    @Override
    public void actionPerformed(ActionEvent e) {
//        Connection con;

        try {

            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            con = null;
            // 打开链接
            System.out.println("连接数据库...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
//            String name1 = text1.getText().trim();//获取上面的文本
//            String pwd1 = text2.getText().trim();//获取上面的文本
//            String sql = "insert into exam09(name,password) values ('" + name1 + "','" + pwd1 + "')";//写sql语句
//            try {
//                stmt = con.createStatement();//创建一个Statement对象来将 SQL 语句发送到数据库。
//                stmt.executeUpdate(sql);    //添加修改删除 都用executeUpdate
//                JOptionPane.showMessageDialog(null, "添加成功。");
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }



            String sql = "insert into exam09 values " + "(" + ")";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                String name = rs.getString("name");
                String password = rs.getString("password");
                System.out.println("==userName=" + name + "==Passwd=" + password);

            }
            rs.close();
            st.close();
            con.close();

        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception ex) {
            // 处理 Class.forName 错误
            ex.printStackTrace();

        }
    }
}