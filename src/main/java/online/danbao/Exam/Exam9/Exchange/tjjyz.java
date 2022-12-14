package online.danbao.Exam.Exam9.Exchange;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

public class tjjyz extends JFrame {
    private static final java.awt.event.ActionListener ActionListener = null;
    JLabel biaoqian1, biaoqian2, biaoqian3, biaoqian4;
    JTextField text1, text2, text3, text4;
    JButton button1, button2;
    protected String sql;

    public tjjyz() {
        setTitle("用户注册");
        setLayout(null);
        this.setBounds(500, 500, 300, 300);
        this.setVisible(true);
        biaoqian1 = new JLabel("用户名");
        add(biaoqian1);
        biaoqian1.setBounds(10, 10, 100, 20);
        text1 = new JTextField(10);
        add(text1);
        text1.setBounds(40, 10, 100, 20);
        biaoqian2 = new JLabel("密码");
        add(biaoqian2);
        biaoqian2.setBounds(10, 30, 100, 20);
        text2 = new JPasswordField(10);
        add(text2);
        text2.setBounds(40, 30, 100, 20);
        button1 = new JButton("保存");
        add(button1);
        button1.setBounds(20, 90, 60, 20);
        button2 = new JButton("取消");
        add(button2);
        button2.setBounds(90, 90, 60, 20);
        action();
    }

    public void action() {
        button1.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                Connection con;
                Statement stmt;
//	            ResultSet rs;迭代用的配上rs=stmt.executeQuery（Sql）；re.next,rs.getString(i);
                con = GetDBConnection.connectDB("root", "ldd123789dd");//调用DB
//	            if(con==null) return ;
                String name1 = text1.getText().trim();//获取上面的文本
                String pwd1 = text2.getText().trim();//获取上面的文本
                String sql = "insert into exam09(name,password) values ('" + name1 + "','" + pwd1 + "')";//写sql语句
                try {
                    stmt = con.createStatement();//创建一个Statement对象来将 SQL 语句发送到数据库。
                    stmt.executeUpdate(sql);    //添加修改删除 都用executeUpdate
                    JOptionPane.showMessageDialog(null, "添加成功。");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }
}

