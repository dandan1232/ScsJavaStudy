package online.danbao.ScsJavaStudy.Chapter5.Exercise5_10;

public class Circle extends Geometry {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return (3.14 * r * r);
    }
}




