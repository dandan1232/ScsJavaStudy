package online.danbao.ScsJavaStudy.Chapter4;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 19:55
 * @description:
 */
public class Example4_6 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        double result = computer.getResult(1.0 / 3, 10, 20, 30);//"参数代表"x代表了3个参数
        System.out.println("10,20,30的平均数:" + result);
        result = computer.getResult(1.0 / 6, 66, 12, 5, 89, 2, 51);//"参数代表"x代表了6个参数
        System.out.println("66,12,5,89,2,51的平均数：" + result);
    }
}