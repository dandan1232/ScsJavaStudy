package online.danbao.Exam.Exam9.Exchange;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 蛋宝
 * @date: 2022/12/15 9:59
 * @description:
 */
public class WindowsMenu2 extends JFrame {
    JLabel biaoqian1, biaoqian2;
    JTextField text1, text2, text3, text4;
    JButton button1, button2;
    protected String sql;
    WindowsMenu2(){
        DbListener db = new DbListener();
        db.setWin2(this);
        setLayout(new FlowLayout());
//        setLayout(null);
//        this.setBounds(0, 0, 3000, 3000);
        setTitle("用户注册");
        setLayout(null);
        this.setBounds(500, 500, 300, 300);
        this.setVisible(true);
        biaoqian1 = new JLabel("用户名");
        add(biaoqian1);
        biaoqian1.setBounds(10, 10, 100, 20);
        text1 = new JTextField(10);
        add(text1);
        db.setUid(text1);
        text1.setBounds(40, 10, 100, 20);
        biaoqian2 = new JLabel("密码");
        add(biaoqian2);
        biaoqian2.setBounds(10, 30, 100, 20);
        text2 = new JPasswordField(10);
        add(text2);
        db.setpd(text2);
        text2.setBounds(40, 30, 100, 20);
        button1 = new JButton("保存");
        add(button1);
        button1.addActionListener(db);
        button1.setBounds(20, 90, 60, 20);
        button2 = new JButton("取消");
        add(button2);
        button2.setBounds(90, 90, 60, 20);


//        JLabel j1= new JLabel("用户名");
////        j1.setBounds(500,45,50,20);
//        add(j1);
//        JLabel j2= new JLabel("密码");
////        j2.setBounds(500,75,120,20);
//        add(j2);
//        JTextField jt1 = new JTextField(10);
////        jt1.setBounds(560,45,120,20);
//        add(jt1);
//        db.setUid(jt1);
//        JTextField jt2 = new JTextField(10);
////        jt2.setBounds(560,75,120,20);
//        add(jt2);
//        db.setpd(jt2);
//
//        JButton jb1 = new JButton("登录");
////        jb1.setBounds(560,75,60,20);
//        add(jb1);
//        jb1.addActionListener(db);
//
//        JButton jb2 = new JButton("重置");
////        jb2.setBounds(560,185,60,20);
//        add(jb2);
//        setVisible(true);
    }
}
