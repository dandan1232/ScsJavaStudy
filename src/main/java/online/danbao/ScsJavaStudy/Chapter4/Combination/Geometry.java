package online.danbao.ScsJavaStudy.Chapter4.Combination;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 20:10
 * @description:
 */
public class Geometry {
    Rectangle rect;
    Circle circle;

    Geometry(Rectangle rect, Circle circle) {
        this.rect = rect;
        this.circle = circle;
    }

    public void setCirclePosition(double x, double y) {
        circle.setX(x);
        circle.setY(y);
    }

    public void setCircleRadius(double redius) {
        circle.setRadius(redius);
    }

    public void setRectanglePositon(double x, double y) {
        rect.setX(x);
        rect.setY(y);
    }

    public void setRectangleWidthAndHeight(double w, double h) {
        rect.setWidth(w);
        rect.setHeight(h);
    }

    public void showState() {
        double circleX = circle.getX();
        double rectX = rect.getX();
        if (rectX - rect.getWidth() >= circleX + circle.getRadius()) {
            System.out.println("矩形在圆的右侧");
        }
        if (rectX + rect.getWidth() <= circleX - circle.getRadius()) {
            System.out.println("矩形在圆的左侧");

        }
    }

}