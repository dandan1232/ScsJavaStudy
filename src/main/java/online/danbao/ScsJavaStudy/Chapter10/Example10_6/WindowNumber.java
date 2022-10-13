package online.danbao.ScsJavaStudy.Chapter10.Example10_6;

import com.sun.org.apache.xml.internal.security.Init;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author: 蛋宝
 * @date: 2022/10/13 9:09
 * @description:创建窗口
 */
public class WindowNumber extends JFrame {
    JTextField text;
    JButton button;
    PoliceListen listener;
    public WindowNumber(){
        init();
        setBounds(100, 100, 150, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        this.setLayout(new FlowLayout());
        text = new JTextField(10);
        listener=new PoliceListen();
        text.addActionListener(listener);
        add(text);
    }


}