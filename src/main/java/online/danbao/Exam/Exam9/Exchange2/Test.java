package online.danbao.Exam.Exam9.Exchange2;

import online.danbao.Exam.Exam9.Exchange.WindowsMenu2;

import javax.swing.*;

/**
 * @author bobo
 * @cerate 2022-12-24-17:01
 */
public class Test extends JFrame {
    JLabel user,password;
    JTextField text1,text2;
    JButton save,cancel;
    testListen listen;

    public Test(String s,int a,int b,int c,int d){
        init();
        setVisible(true);
        setTitle(s);
        setBounds(a,b,c,d);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init(){
        setLayout(null);
        user = new JLabel("用户名：");
        password = new JLabel("密码:");
        text1 = new JTextField();
        text2 = new JPasswordField();
        save = new JButton("保存");
        cancel = new JButton("取消");

        user.setBounds(80,30,100,30);
        add(user);
        password.setBounds(80,60,100,30);
        add(password);
        text1.setBounds(160,35,100,20);
        add(text1);
        text2.setBounds(160,65,100,20);
        add(text2);
        save.setBounds(100,100,60,20);
        add(save);
        cancel.setBounds(200,100,60,20);
        add(cancel);

        listen = new testListen();//保存按钮注册监听
        listen.setView(this);
        save.addActionListener(listen);

    }


}
