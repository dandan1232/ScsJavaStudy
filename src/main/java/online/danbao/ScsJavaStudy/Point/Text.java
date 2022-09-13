package online.danbao.ScsJavaStudy.Point;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 16:36
 * @description:测试类
 */
public class Text {
    public static void main(String[] args) {
        Point po = new Point(13, 27);
        System.out.println("原始大小x=" + po.getX() + "，y=" + po.getY());
        po.setX(2);
        po.setY(89);
        System.out.println("大小x=" + po.getX() + "，y=" + po.getY());

    }
}