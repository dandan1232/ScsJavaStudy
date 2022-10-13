package online.danbao.ScsJavaStudy.Chapter10.Example10_8;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 蛋宝
 * @date: 2022/10/13 9:40
 * @description:
 */
public class WindowView extends JFrame{
    public JTextField inputNumberOne,inputNumberTwo;
    public JComboBox<String> choiceFuhao;
    public JTextArea textShow;
    public JButton button;
    public OperatorListener operator;
    public ComputerListener computer;
    public WindowView(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        inputNumberOne = new JTextField(5);
        inputNumberTwo = new JTextField(5);
        choiceFuhao=new JComboBox<String>();
        button = new JButton("计算");
        choiceFuhao.addItem("选择运算符号:");
        String []a ={"+","-","*","/"};
        for (int i = 0; i < a.length; i++) {
            choiceFuhao.addItem(a[i]);
        }
        textShow = new JTextArea(9, 30);
        operator = new OperatorListener();
        computer = new ComputerListener();
        operator.setView(this);
        computer.setView(this);
        choiceFuhao.addItemListener(operator);
        button.addActionListener(computer);
        add(inputNumberOne);
        add(choiceFuhao);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
    }
}