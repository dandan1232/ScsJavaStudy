package online.danbao.Exam.Exam9.Exchange2;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.Properties;

/**
 * @author bobo
 * @cerate 2022-11-29-19:38
 */
public class JDBCUtils {
    //JDBC工具类


    //静态方法一：获得连接
    public static Connection getConnection() throws SQLException {
        Driver driver = null;
        Connection connect = null;
        //1.驱动注册

            driver = new Driver();


            // url:http://localhost:8080/gmall/keyboard.jpg
            // jdbc:mysql:协议
            // localhost:ip地址
            // 3306：默认mysql的端口号
            // mysql:mysql的存储mysql本身一些信息的数据库

            String url = "jdbc:mysql://localhost:3306/scsstudy?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";     //2.连接的数据库的URL

            Properties info = new Properties();                         //3.封装用户名密码
            info.setProperty("user", "root");                           // 将用户名和密码封装在Properties中
            info.setProperty("password", "ldd123789dd");

            //4.获得连接
            connect = driver.connect(url, info);


        return connect;
    }


    //静态方法二：关闭资源(适用：增删改)
    public static void closeResource(Connection con, Statement ps){
        try{
            if(con != null)
                con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            if(ps != null) {
                ps.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //重载的资源关闭方法，（适用：查询 ）
    public static void closeResource(Connection con, Statement ps,ResultSet rs){
        try{
            if(con != null) {
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            if(ps != null) {
                ps.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            if(rs != null) {
                rs.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
