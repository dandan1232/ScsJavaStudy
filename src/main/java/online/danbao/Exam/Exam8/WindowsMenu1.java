package online.danbao.Exam.Exam8;

import javax.swing.*;
import java.awt.*;

public class WindowsMenu1 extends JFrame {

    WindowsMenu1(){
        FileListener fl = new FileListener();
        fl.setView(this);
        setLayout(new FlowLayout());
        setLayout(null);
       JLabel j1 = new JLabel("用户名");
       j1.setBounds(500,45,50,20);
        add(j1);
        JLabel j2 = new JLabel("密码");
        j2.setBounds(500,75,120,20);
        add(j2);
        JTextField jt1 = new JTextField(10);
        jt1.setBounds(560,45,120,20);
        add(jt1);
       fl.setJTextFiledone(jt1);
        JTextField jt2 = new JTextField(10);
        jt2.setBounds(560,75,120,20);
        fl.setJTextFiledtwo(jt2);
        add(jt2);
        JButton jb1 = new JButton("登录");
        jb1.setBounds(560,105,60,20);
        add(jb1);
        JButton jb2 = new JButton("重置");
        jb2.setBounds(640,105,60,20);
        add(jb2);


        this.setTitle("用户登录");
        this.setSize(3000,2000);
        this.setLocationRelativeTo(null);

        setVisible(true);
        jb1.addActionListener(fl);
    }
}
