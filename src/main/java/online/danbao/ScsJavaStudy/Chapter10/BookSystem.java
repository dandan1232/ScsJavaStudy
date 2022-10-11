package online.danbao.ScsJavaStudy.Chapter10;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 蛋宝
 * @date: 2022/10/11 10:32
 * @description:图书管理系统
 */
public class BookSystem {
    public static void main(String[] args) {
        JFrame window1 = new JFrame("第一个窗口");
        JFrame window2 = new JFrame();
        window2.setTitle("第二个窗口");
//        Mywindow3 win3 = new Mywindow3(460,100,188,108);
        WindowMenu win = new WindowMenu("欢迎使用图书管理系统",100,100,400,390);
        WindowsMenu3 win3 = new WindowsMenu3("欢迎使用图书管理系统",100,100,400,390);
        Container con = window1.getContentPane();
        con.setBackground(Color.CYAN);
        window1.setBounds(60, 100, 188, 108);
        window2.setBounds(260, 100, 188, 108);
//第一个窗口
        window1.setVisible(true);
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//欢迎使用图书管理系统
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        win3.setVisible(true);
        win3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        window2.setVisible(true);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}