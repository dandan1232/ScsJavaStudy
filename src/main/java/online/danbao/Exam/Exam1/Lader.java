package online.danbao.Exam.Exam1;

/**
 * @author: 蛋宝
 * @date: 2022/12/5 23:01
 * @description:
 * 1.	编写一个Java应用程序，该程序中有3个类：Lader、Circle和主类A。
 * 具体要求如下：
 * Lader类具有类型为double的上底、下底、高、面积属性，具有返回面积的功能，包括一个构造方法对上底、下底、高进行初始化。
 * Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能，包括一个构造方法对半径进行初始化。
 * 主类A用来测试类Lader和类Circle的功能。
 */
public class Lader {
    double shangdi,xiadi,height,area;
    Lader(Double shangdi,Double xia,Double gao)
    {
        this.shangdi=shangdi;
        xiadi=xia;
        height=gao;
    }
    double area(){
        area=(shangdi+xiadi)*height/2;
        System.out.println("梯形的面积是："+area);
        return area;
    }

}