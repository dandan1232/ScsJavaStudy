package online.danbao.ScsJavaStudy.Chapter4;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 16:18
 * @description:计算圆周长和面积
 */
public class Clu {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setR(20);
        System.out.println("周长："+circle.getC()+"\n面积："+circle.getArea());
    }

}