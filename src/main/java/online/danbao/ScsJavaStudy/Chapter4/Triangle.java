package online.danbao.ScsJavaStudy.Chapter4;

public class Triangle {
    double sideA, sideB, sideC;

    protected double getArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    protected void setSides(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }
}




