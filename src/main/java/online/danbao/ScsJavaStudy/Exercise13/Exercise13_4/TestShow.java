package online.danbao.ScsJavaStudy.Exercise13.Exercise13_4;

/**
 * @author: 蛋宝
 * @date: 2022/11/22 17:42
 * @description:
 * 编写GUI程序。首先编写一个封装学生信息的类，然后再编写一个窗口。要求：
 * （1）窗口使用三文本框和一个文本区为学生对象中的数据提供视图，
 * 其中三个文本框用来显示和更新学生对象的姓名、数学成绩和英语；文本区对象用来显示学生的姓名和总成绩。
 * （2）窗口中有一个按钮，用户单击该按钮后，程序用3个文本框中的数据分别作为学生对象的姓名、数学成绩底和英语成绩，
 * 并将学生的姓名和总成绩显示在文本区中。
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.TreeSet;

public class TestShow {
public static void main(String[] args) {
// TODO Auto-generated method stub
        MyJFrame myJFrame=new MyJFrame("文本框显示");
        myJFrame.Init();
        }
        }
class MyJFrame extends JFrame {
    String name;
    double sxscore,yyscore;
    JPanel jPanel1,jPanel2,jPanel3,jPanel4;
    JTextField nameText,yyscoreText,sxscoreText;
    JLabel nameJLabel,yyscoreJLabel,sxscoreJLabel;
    JButton addButton;
    JTextArea showArea;
    Box box1,box2;
    private TreeSet ts=new TreeSet();
    public MyJFrame(String title){
        super(title);
    }
    public void Init(){
        this.setBounds(100,100,400,400);
        GridLayout layout1 = new GridLayout(2,1);
        jPanel1=new JPanel();
        jPanel1.setLayout(layout1);
        nameText=new JTextField("",2);
        yyscoreText=new JTextField("",2);
        sxscoreText=new JTextField("",2);
        nameJLabel=new JLabel("姓名：");
        sxscoreJLabel=new JLabel("数学成绩：");
        yyscoreJLabel=new JLabel("英语成绩：");
        addButton=new JButton("添加");

        jPanel2=new JPanel();
        GridLayout layout2 = new GridLayout(1,2);
        jPanel2.setLayout(layout2);

        jPanel3=new JPanel();
        GridLayout layout3 = new GridLayout(2,1);
        jPanel3.setLayout(layout3);
        box1=Box.createHorizontalBox();
        box1.add(Box.createHorizontalStrut(1));
        box1.add(nameJLabel);
        box1.add(nameText);
        box2=Box.createHorizontalBox();
        box2.add(Box.createHorizontalStrut(2));
        box2.add(yyscoreJLabel);
        box2.add(yyscoreText);
        box2.add(sxscoreJLabel);
        box2.add(sxscoreText);

        box1.add(addButton);

        jPanel3.add(box1);
        jPanel3.add(box2);
        jPanel2.add(jPanel3);
        jPanel4=new JPanel(new BorderLayout());
        jPanel4.add(addButton,BorderLayout.CENTER);
        jPanel2.add(jPanel4);
        jPanel1.add(jPanel2);

        showArea=new JTextArea();
        JScrollPane jp1=new JScrollPane(showArea);
        jPanel1.add(showArea);

        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
                name=nameText.getText().trim();
                yyscore=Double.parseDouble(yyscoreText.getText().trim());
                sxscore=Double.parseDouble(sxscoreText.getText().trim());
//System.out.println(name+"："+score);
                showArea.setText("");
                ts.add(new Student(name, yyscore+sxscore));
                Iterator it=ts.iterator();
                while (it.hasNext()) {
                    String string=it.next().toString()+'\n';
                    showArea.append(string);
                }
            }
        });
        this.add(jPanel1);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
class Student implements Comparable{
    private String name;
    private double score;

    public String getName() {
        return name;
    }


    public double getscore() {
        return score;
    }
    @Override
    public String toString(){
        return "姓名："+name+"，总成绩："+score+"。";
    }
    public Student(String name,double score){
        this.name=name;
        this.score=score;
    }


    @Override
    public int compareTo(Object arg0) {
// TODO Auto-generated method stub
        Student s=(Student) arg0;
        if(this.score-s.score>0) {
            return 1;
        }
        if(this.score-s.score==0) {
            return this.name.compareTo(s.name);
        }
        return -1;
    }
}