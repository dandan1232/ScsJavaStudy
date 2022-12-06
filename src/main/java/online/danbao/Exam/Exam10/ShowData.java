package online.danbao.Exam.Exam10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.LinkedList;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 23:41
 * @description:
 */
public class ShowData {

    //获取数据库中的数据并以list返回
    private static java.util.List<goods> getDbData() throws ClassNotFoundException, SQLException {
        //1,注册驱动信息
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2,获取连接对象
        String url ="jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        Connection conn= DriverManager.getConnection(url,"root","ldd123789dd");
        String sql="select * from goods order by price desc";
        //3,连接对象conn的方法prepareStatement获取SQL语句的预编译对象
        PreparedStatement parameter =conn.prepareStatement(sql);
        //4,执行sql
        ResultSet result =parameter.executeQuery();
        //返回的数据List
        LinkedList<goods> list =new LinkedList<>();
        while (result.next()){

            goods goods1 =new goods();
            goods1.setNumber(result.getString("number"));
            goods1.setName(result.getString("name"));
            goods1.setMadeTime(result.getTime("madeTime"));
            goods1.setPrice(result.getInt("price"));
            list.add(goods1);
            System.out.println("number:"+result.getString("number")+" "
                    +"name:"+result.getString("name")+" "
                    +"madeTime:"+result.getTime("madeTime")+" "
                    +"price:"+result.getInt("price"));
        }
        result.close();
        parameter.close();
        conn.close();

        return list;

    }
    //创建窗口，以列表展示从数据库中获取的数据
    private static void showFrame(java.util.List<goods> list){

        //1，设定窗口
        JFrame frame =new JFrame("从mysql中获取数据并展示~");
        frame.setLocation(700,400);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        //2,添加table
        JTable table =null;
        String [] index={"number","name","madeTime","price"};
        Object [][] data=new Object[list.size()][index.length];
        //3,向data中添加数据
        for (int i = 0; i < list.size(); i++) {
            goods goods1 =list.get(i);
            data[i][0]=goods1.getNumber();
            data[i][1]=goods1.getName();
            data[i][2]=goods1.getMadeTime();
            data[i][3]=goods1.getPrice();

        }
        //4,创建一个默认的表格模型
        DefaultTableModel defaultModel = new DefaultTableModel(data, index);
        table=new JTable(defaultModel);
        table.setBackground(Color.cyan);
        table.setPreferredScrollableViewportSize(new Dimension(100, 80));//JTable的高度和宽度按照设定
        table.setFillsViewportHeight(true);

        //5，给表格设置滚动条
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(table);

        Font font = new Font("宋体", Font.BOLD, 13);

        //添加button
//        JButton button =new JButton("查询");
//        button.setBounds(50,10,50,30);

        //添加label
//        JLabel label =new JLabel("点击按钮，查询MySQL数据库中的数据：");
//        label.setFont(font);
//        label.setBounds(1,10,240,30);

        //通过panel组合button，label
//        JPanel panel =new JPanel();
//        panel.setBackground(Color.GRAY);
//        panel.setSize(200,100);
//        panel.add(label);
//        panel.add(button);

        //6，添加表格、滚动条到容器中
//        frame.add(panel, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.add(jScrollPane,BorderLayout.CENTER);


//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.add(jScrollPane,BorderLayout.CENTER);
//                frame.setVisible(true);
//
//            }
//        });

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        getDbData();
        showFrame(getDbData());
    }
}
