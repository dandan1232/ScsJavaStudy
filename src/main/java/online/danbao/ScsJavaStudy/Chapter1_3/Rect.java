package online.danbao.ScsJavaStudy.Chapter1_3;

/**
 * @author: 蛋宝
 * @date: 2022/9/6 10:49
 * @description: 长方形的高宽
 */
public class Rect {
    double width;
    double height;
    double getArea(){
        return width*height;
    }
}
class Example_2{
    public static void main(String[] args) {
        Rect rectangle;
        rectangle=new Rect();
        rectangle.width=1.819;
        rectangle.height=1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积："+area);
    }
}