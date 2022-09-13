package online.danbao.ScsJavaStudy.Point;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 16:35
 * @description: 创建一个Point类，有成员变量x，y，方法getX(),setX()，
 * 还有一个构造方法初始化x和y。创建类主类A来测试它。
 */
public class Point {
    //属性
    private double x;
    private double y;
    private double d;

    //构造方法
    Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.d = x + y;
    }


    //成员方法
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}