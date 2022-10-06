package online.danbao.ScsJavaStudy.Exercise9.Exercise9_3;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:50
 * @description:
 * 设计一个测试类，调用UseCompute中的方法useCom来完成±* /运算
 */
public class Test {
    public static void main(String[] args) {
        double ans;
        Computer computer;
        computer = new Add();
        UseCompute.useCom(computer,28,2);
        computer = new Subtract();
        UseCompute.useCom(computer,28,2);
        computer = new Multiply();
        UseCompute.useCom(computer,28,2);
        computer = new Divide();
        UseCompute.useCom(computer,28,2);

    }
}
