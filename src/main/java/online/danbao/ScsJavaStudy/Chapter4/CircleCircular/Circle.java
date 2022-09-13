package online.danbao.ScsJavaStudy.Chapter4.CircleCircular;

/**
 * @author: 蛋宝
 * @date: 2022/9/6 14:28
 * @description:
 */
public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }
}