package online.danbao.Exam.Exam6;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:18
 * @description:
 * （1）编写一个接口：InterfaceA，只含有一个方法int method(int n)；
 * （2）编写一个类：ClassA来实现接口InterfaceA，实现int method(int n)接口方法时，要求计算1到n的和；
 * （3）编写另一个类：ClassB来实现接口InterfaceA，实现int method(int n)接口方法时，要求计算n的阶乘（n!）；
 * （4）编写测试类E，在测试类E的main方法中使用接口回调的形式来测试实现接口的类。
 */
public interface InterfaceA {
    //定义抽象方法
    int method(int n);
}
