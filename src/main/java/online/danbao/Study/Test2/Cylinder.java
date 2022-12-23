package online.danbao.Study.Test2;
import java.text.DecimalFormat;
/**
 * @author: 蛋宝
 * @date: 2022/12/23 14:14
 * @description:
 * 按照面向对象的思想，设计并编程实现下面两个类:
 * —个图柱类,属性包括底面半径和高,方法包括此圆柱体的体积和表面积；
 * 一个测试类，创建一个圆柱体对象（底面半径和高分别是6和9）,参考下面输出样例形式（小数点后保留2位数字），输出此圆柱体的信息。
 * 输出样例：圆柱体（1,1）的体积为3.14，表面积为12.57
 *
 */

//圆柱类
public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
//体积
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
//表面积
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}


