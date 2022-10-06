package online.danbao.Temp;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 20:21
 * @description:
 */

public class E {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        Geometry geometry = new Geometry();
        geometry.setCircle(circle);
        Circle CircleTwo = new Circle();
        geometry.setCircle(CircleTwo);
        System.out.println(circle.radius+"+"+geometry.c.radius);

    }
}