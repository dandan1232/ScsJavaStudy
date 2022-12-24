package online.danbao.Exam.Exam9.Exchange2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author bobo
 * @cerate 2022-12-24-17:22
 */
public class testListen implements ActionListener {
    Test view;


    public void  setView(Test view){  //传递窗口引用
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //1.获取数据库连接
            connection = JDBCUtils.getConnection();
            //2.预编译sql语句
            String sql = "insert into exam09(name,passwd) values (?,?)";
            ps = connection.prepareStatement(sql);
            //3.填充占位符
            ps.setObject(1, view.text1.getText());
            ps.setString(2, view.text2.getText());

            //4.执行
            ps.execute();
        }catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            //5.资源关闭
            JDBCUtils.closeResource(connection, ps);
            System.out.println("已保存");
        }
    }

    public static void main(String[] args) {
        Test test = new Test("用户注册",800,300,400,300);
    }

}
