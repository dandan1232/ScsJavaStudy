package online.danbao.ScsJavaStudy.Exercise13.Exercise13_2;

import java.awt.event.*;
import javax.swing.*;
public class Police implements KeyListener,FocusListener  {
    @Override
    public void keyPressed(KeyEvent e) {
      JTextField t = (JTextField)e.getSource();
      if(t.getCaretPosition()>=6) {
          t.transferFocus();
      }
    }
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void focusGained(FocusEvent e) {
      JTextField text=(JTextField)e.getSource();
      text.setText(null); 
    }
    @Override
    public void focusLost(FocusEvent e){}
}