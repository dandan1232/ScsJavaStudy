package online.danbao.ScsJavaStudy.Chapter4;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 15:19
 * @description: 编程题：创建一个类Circle，属性：半径，周长，面积；方法：计算周长，计算面积；
 * 自己编写构造方法给半径赋初值。主函数里创建一个圆，并输出该圆的周长和面积。
 */
public class Circle {
    int radius;
    double cir;
    double area;

    public double getR() {
        return radius;
    }

    public void setR(int radius) {
        this.radius = radius;
    }

    //计算周长
    double getC() {
        return 2 * 3.14 * radius;
    }

    //计算面积
    double getArea() {
        return 3.14 * radius * radius;
    }

}


