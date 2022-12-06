package online.danbao.Exam.Exam8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FileListener implements ActionListener {
 WindowsMenu1 win1 ;
 public void setView( WindowsMenu1 win1){
     this.win1 = win1;
 }
    JTextField inputyh;
  JTextField inputmm;
  String inputUserid ,inputUserpwd;
    public void setJTextFiledone(JTextField inputyh){
        this.inputyh=inputyh;

    }
    public void setJTextFiledtwo(JTextField inputmm){
        this.inputmm = inputmm;
    }
  File file = new File("D:\\Study\\ScsJavaStudy\\src\\main\\java\\online\\danbao\\Exam\\Exam8\\pwd.txt");


    @Override

    public void actionPerformed(ActionEvent e) {
        try{

          inputUserid = inputyh.getText().trim();
          inputUserpwd =inputmm.getText().trim();
          FileOutputStream fileout = new FileOutputStream(file);
          ObjectOutputStream objectout = new ObjectOutputStream(fileout);
          objectout.writeObject(inputUserid);
          objectout.writeObject(inputUserpwd);
          FileInputStream filein= new FileInputStream(file);
          ObjectInputStream objectin = new ObjectInputStream(filein);
          objectin.readObject();
          objectin.close();
          System.out.println(inputUserid);
          System.out.println(inputUserpwd);


        }
        catch (Exception e1 ){
                System.out.println("meifany");
        }

    }
}
