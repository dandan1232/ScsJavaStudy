package online.danbao.Exam.Exam9;

import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 14:19
 * @description:
 */
public class Login extends JFrame implements ActionListener {

    JButton jb1, jb2, jb3;  //按钮
    JPanel jp1,jp2,jp3, jp4;    //面板
    JTextField jtf;   //文本框
    JLabel jlb1, jlb2, jlb3; //标签
    JPasswordField jpf; //密码框


    public  Login() {

        jb1 = new JButton("保存");
        jb2 = new JButton("取消");
        //设置按钮监听
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jp1 = new JPanel();  //创建面板
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();


        jlb1 = new JLabel("用户名");  //添加标签
        jlb2 = new JLabel("  密  码");

        jtf = new JTextField(10); //创建文本框和密码框
        jpf = new JPasswordField(10);

        //加入面板中
        jp1.add(jlb1);
        jp1.add(jtf);

        jp2.add(jlb2);
        jp2.add(jpf);

        jp3.add(jb1);
        jp3.add(jb2);


        //将JPane加入JFrame中
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);



        //设置布局
        this.setTitle("用户登录");
        this.setLayout(new GridLayout(3,1));
        this.setSize(300, 200);   //设置窗体大小
        this.setLocationRelativeTo(null);//在屏幕中间显示(居中显示)
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  //设置仅关闭当前窗口

        this.setVisible(true);  //设置可见
        this.setResizable(false); //设置不可拉伸大小

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Connection con;
        Statement sql;
        ResultSet rs;
        // TODO Auto-generated method stub
        if (e.getActionCommand()=="保存")
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
//            try {
//                String url="jdbc:mysql://localhost:3306/library_system?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
//                con= DriverManager.getConnection(url,"root","ldd123789dd");
//            }
        }
        else if(e.getActionCommand()=="取消")
        {
            //  clear();
//            new Register();
//            dispose();  //使窗口消失
        }
    }
    //清空账号和密码框
//    private void clear() {
//        // TODO Auto-generated method stub
//        jtf.setText("");    //设置为空
//        jpf.setText("");
//
//    }

    //验证登录信息，并做处理
//    public  void login() throws HeadlessException, IOException
//    {
//        //判断账户名和密码是否包含中文
//        if (new Check().checkcountname(jtf.getText())||new Check().checkcountname(jpf.getText()))
//        {
//            JOptionPane.showMessageDialog(null, "用户名或密码存在中文，不合法!","消息提示",JOptionPane.WARNING_MESSAGE);
//        }
//        else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(null, "账号密码为空，请输入！","消息提示",JOptionPane.WARNING_MESSAGE);
//        }
//        else if (jtf.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(null, "账号为空，请输入！","消息提示",JOptionPane.WARNING_MESSAGE);
//        }
//        else if (jpf.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(null, "密码为空，请输入！","消息提示",JOptionPane.WARNING_MESSAGE);
//
//        }
//        else if (new Check().check1(jtf.getText(),jpf.getText()))
//        {
//            JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.WARNING_MESSAGE);
//            dispose();  //使文原窗体消失
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "账号密码错误请重新输入！","消息提示",JOptionPane.ERROR_MESSAGE);
//            clear();  //调用清除函数
//        }
//    }
//    private static void fileWriter() {
//        Reader fr = null;
//        Writer fw = null;
//        try {
//            //先读
//            fr = new FileReader("Message.txt");
//            StringBuilder sb = new StringBuilder();
//            int read;
//            while ((read = fr.read()) != -1) {
//                System.out.print((char) read);
//                sb.append((char) read);
//            }
//            //再写
//            File file = new File(CHINESE_OUT_PATH);
//            fw = new FileWriter(file);
//            fw.write(sb.toString());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        } finally {
//            if (fw != null) {
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    System.err.println(e.getMessage());
//                }
//            }
//            if (fr != null) {
//                try {
//                    fr.close();
//                } catch (IOException e) {
//                    System.err.println(e.getMessage());
//                }
//            }
//        }
//    }

        public static void main(String[] args) throws IOException {
            new Login();//首先进入登录界面
    }
}