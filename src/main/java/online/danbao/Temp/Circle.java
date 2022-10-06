package online.danbao.Temp;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 20:15
 * @description:
 */
public class Circle {
    int radius = 1;

    void setRadius(int radius) {
        if (radius > 0)
            this.radius = radius;
    }
}

class Geometry {
    Circle c;

    void setCircle(Circle c) {
        c.radius += 10;
        this.c = c;
    }
}
