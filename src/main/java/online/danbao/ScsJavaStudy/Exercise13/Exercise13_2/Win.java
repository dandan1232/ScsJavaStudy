package online.danbao.ScsJavaStudy.Exercise13.Exercise13_2;

import java.awt.*;
import javax.swing.*;
public class Win extends JFrame {
   JTextField text[]=new JTextField[3];
   Police police; 
   JButton b;
   Win() {
      setLayout(new FlowLayout());
      police = new Police();
      for(int i=0;i<3;i++) {
         text[i] = new JTextField(7);
         text[i].addKeyListener(police);  //���Ӽ����¼�
         text[i].addFocusListener(police);
         add(text[i]);
      }
      b = new JButton("ȷ��");
      add(b);
      text[0].requestFocusInWindow();
      setVisible(true); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 