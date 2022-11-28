package online.danbao.test;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 蛋宝
 * @date: 2022/11/24 9:46
 * @description:
 */
public class Stu01 extends  JFrame{
    public static void main(String[] args) {
        Stu01   st =   new Stu01();
        st.Pan();
    }
    public void Pan() {
        this.setTitle("火影忍者");
        //退出系统程序关闭指令
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口的大小
        this.setSize(800, 600);
        //设置窗口的位置
        this.setLocationRelativeTo(null);
        //设置窗口的大小不能改变
        //frame.setResizable(false);
        //显示窗口
        this.setVisible(true);
    }
    //重paint方法，绘制图片
    @Override
    public void paint(Graphics g)
    {
        g.drawImage(GameUtils.image,0,0,800,600,this);
        //设置图片的大小和你界面窗口的大小一样
    }


}