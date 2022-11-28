package online.danbao.test;

import online.danbao.test.Stu01;

import javax.swing.*;
import java.awt.*;

public class OneFrame  extends Stu01 {
    public OneFrame()
    {
        JFrame jFrame = new JFrame( );
        //获取背景图片路径
        ImageIcon  bg = new ImageIcon("http://pic-ldd-test.oss-cn-hangzhou.aliyuncs.com/avatar/FEF1B5600E2AEBAB5695FAF79BD057A4.jpg");
        //建立图像文本
        JLabel  label  =  new JLabel(bg);
        //设置图片的大小
        label.setSize(700,500);
        //把背景图片添加到最底层
        jFrame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
        JPanel pan =  (JPanel)jFrame.getContentPane();
        //将内容窗口设为透明
        pan.setOpaque(false);
        pan.setLayout(new FlowLayout());
        jFrame.setTitle("学生成绩管理系统");
        JButton  button  = new JButton("登录");
        jFrame.add(button);
        //标签控件
        jFrame.add(new JLabel("欢迎使用系统！"));
        //退出系统程序关闭指令
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口的大小
        jFrame.setSize(700,500);
        //设置窗口的位置
        jFrame.setLocationRelativeTo(null);
        //设置窗口的大小不能改变
        jFrame.setResizable(false);
        //显示窗口
        jFrame.setVisible(true);
    }

}