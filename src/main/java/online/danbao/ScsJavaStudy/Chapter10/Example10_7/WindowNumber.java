package online.danbao.ScsJavaStudy.Chapter10.Example10_7;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 蛋宝
 * @date: 2022/10/13 9:09
 * @description:创建窗口
 */
public class WindowNumber extends JFrame {
    JTextField textInput,textShow;
    JButton button;
    PoliceListen listener;
    public WindowNumber(){
        init();
        setBounds(100, 100, 320, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        this.setLayout(new FlowLayout());
       button=new JButton("确定");
        textInput = new JTextField(10);
        textShow = new JTextField(10);
        textShow.setEditable(false);
        listener = new PoliceListen();
        listener.setView(this);
        textInput.addActionListener(listener);
        button.addActionListener(listener);
        add(textInput);
        add(button);
        add(textShow);


    }


}