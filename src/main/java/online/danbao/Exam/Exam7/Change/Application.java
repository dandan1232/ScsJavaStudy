package online.danbao.Exam.Exam7.Change;

/**
 *设计一个一个应用程序，求不同柱类体积。为了便于扩展采用面向抽象的编程思想来实现。画出设计类图，
 * 并编写相应的类以及主类（应用程序），并求出2种柱类的体积。
 */

public class Application{
    public static void main(String args[]){
        Pillar pillar;
        Geometry bottom;
        bottom=new Rectangle(12,22);
        pillar =new Pillar (bottom,58);  //pillar是具有矩形底的柱体
        System.out.println("矩形底的柱体的体积"+pillar.getVolume());
        bottom=new Circle(10);
        pillar =new Pillar (bottom,58); //pillar是具有圆形底的柱体
        System.out.println("圆形底的柱体的体积"+pillar.getVolume());
    }
}

