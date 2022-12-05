package online.danbao.Exam.Exam1;

/**
 * @author: 蛋宝
 * @date: 2022/12/5 23:02
 * @description:
 * Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能，包括一个构造方法对半径进行初始化。
 */
public class Circle {
    double banjing,zhouchang,area;
    Circle(Double r)
    {
        banjing=r;

    }
    double area(){
        zhouchang=2*Math.PI*banjing;
        area=Math.PI*banjing*banjing;
        System.out.println("圆的周长是："+zhouchang);
        System.out.println("圆的面积是："+area);
        return area;
    }

}