package online.danbao.ScsJavaStudy.Chapter10;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 蛋宝
 * @date: 2022/10/11 13:45
 * @description:
 */
public class WindowsLogin{
//    JFrame frame;
//    JLabel label1,label2; //用户名和密码
//    JTextField TextField;
//    JPasswordField PasswordField;
//    JButton loginButton,exitButton;
//    JPanel panel;
//
//    WindowsLogin(String s,int a,int b,int c,int d){
//        setTitle(s);
//        setBounds(a,b,c,d);
//        panel=new JPanel();
//        frame.setLayout(null);//设置为null布局
//        label1=new JLabel("用户名");
//        label2=new JLabel("密码");
//        loginButton=new JButton("登录");
//        exitButton=new JButton("退出");
//        TextField=new JTextField(18);
//        PasswordField=new JPasswordField(18);
//        label1.setBounds(220, 220, 500, 80);
//        label2.setBounds(220,220,100,30);
//        loginButton.setBounds(220,220,180,30);
//        exitButton.setBounds(220,220,180,30);
//        TextField.setBounds(220,220,180,30);
//        PasswordField.setBounds(220,220,180,30);
//        panel.add(label1);
//        panel.add(TextField);
//        panel.add(label2);
//        panel.add(PasswordField);
//        panel.add(loginButton);
//        panel.add(exitButton);
//        this.add(panel);
//        this.setVisible(true);
//    }

    public static void main(String[] args) {
        WindowsLogin login = new WindowsLogin();
        login.init();
    }

    public void init() {
        JFrame frame = new JFrame();  //创建窗口
        frame.setSize(500, 400);      //设置窗口大小
        frame.setTitle("登录界面");   // 设置标题
        frame.setLocation(500, 500);  //设置窗口大小
        frame.setLayout(null);             //设置布局为空布局
        JLabel label1 = new JLabel("用户名:");
        JLabel label2 = new JLabel("密码:");
        JButton loginButton = new JButton("登录");
        JButton exitButton = new JButton("退出");
        JTextField TextField = new JTextField(18);
        JPasswordField PasswordField = new JPasswordField(18);
        //设置各组件大小
        //用户名
        label1.setBounds(10, -20, 80, 80);
        TextField.setBounds(90, 0, 180, 30);

//        密码
        label2.setBounds(10, 50, 80, 30);
        PasswordField.setBounds(90,50,180,30);

        loginButton.setBounds(50, 100, 80, 30);
        exitButton.setBounds(150, 100, 80, 30);

        frame.add(label1);
        frame.add(TextField);
        frame.add(label2);
        frame.add(PasswordField);
        frame.add(loginButton);
        frame.add(exitButton);
//        this.add(frame);
        frame.setVisible(true);  //显示界面


    }

}