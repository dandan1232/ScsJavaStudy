package online.danbao.Exam.Exam7.Change;

public class Rectangle extends Geometry {
    double a,b;
    Rectangle(double a,double b) {
        this.a=a; this.b=b;
    }
    @Override
    public double getArea() {
        return a*b;
    }
}






