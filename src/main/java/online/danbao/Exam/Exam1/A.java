package online.danbao.Exam.Exam1;

/**
 * @author: 蛋宝
 * @date: 2022/12/5 23:03
 * @description:
 * 主类A用来测试类Lader和类Circle的功能。
 */
public class A {
    public static void main(String[] args) {

        Lader lader1 =new Lader(2.0,3.0,6.0);
        double mj=lader1.area();

        Circle circle1=new Circle(3.0);
        circle1.area();

    }

}