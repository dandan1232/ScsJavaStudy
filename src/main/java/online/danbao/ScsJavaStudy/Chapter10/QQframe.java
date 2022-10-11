package online.danbao.ScsJavaStudy.Chapter10;

import javax.swing.*;

/**
 * @author: 蛋宝
 * @date: 2022/10/11 14:34
 * @description:
 */
public class QQframe {
    public static void main(String[] args) {
        QQframe q=new QQframe();
        q.init();
    }
    public void init(){
        JFrame frame=new JFrame();  //创建窗口
        frame.setSize(500,400);      //设置窗口大小
        frame.setTitle("登录界面");   // 设置标题
        frame.setLocation(500,500);  //设置窗口大小
        frame.setLayout(null);             //设置布局为空布局
        frame.setDefaultCloseOperation(3);//  设置关闭方式
        ImageIcon icon1=new ImageIcon("C:\\Users\\123\\Desktop\\2.jpg");    //载入图片
        JLabel label=new JLabel(icon1);
        ImageIcon icon2=new ImageIcon("C:\\Users\\123\\Desktop\\back.jpeg");
        JLabel labe2=new JLabel(icon2);
        JLabel labelName=new JLabel("账号：");
        JLabel passname=new JLabel("密码：");
        JButton JB=new JButton("登录");
        JTextField textName = new JTextField();
        JPasswordField JP=new  JPasswordField();
        label.setBounds(0,0,500,80);                          //设置各组件大小
        labe2.setBounds(30,125,90,90);
        labelName.setBounds(188,138,50,20);
        passname.setBounds(188,168,50,20);
        textName.setBounds(238,138,100,20);
        JP.setBounds(238,168,100,20);
        JB.setBounds(153,280,100,20);
        frame.add(label);                                        //添加组件
        frame.add(labe2);
        frame.add(labelName);
        frame.add(passname);
        frame.add(textName);
        frame.add(JP);
        frame.add(JB);
        frame.setVisible(true);	         //显示界面
    }
}

