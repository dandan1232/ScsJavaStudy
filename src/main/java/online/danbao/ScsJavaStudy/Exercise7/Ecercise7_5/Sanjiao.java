package online.danbao.ScsJavaStudy.Exercise7.Ecercise7_5;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 18:47
 * @description:
 */
public class Sanjiao {
    //定义新的成员方法用来求周长
    public String qiuZC(double bian1, double bian2, double bian3) {
        if ((bian1 + bian2) > bian3 && (bian2 + bian3) > bian1 && (bian1 + bian3) > bian2) {
            return "三角形的周长为：" + (bian1 + bian2 + bian3);
        } else {
            return "该三角形的边长不合法，两边之和必须大于第三边";
        }

    }
}