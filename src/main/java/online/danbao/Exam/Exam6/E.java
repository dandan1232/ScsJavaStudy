package online.danbao.Exam.Exam6;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:18
 * @description:
 *  * （4）编写测试类E，在测试类E的main方法中使用接口回调的形式来测试实现接口的类。
 */

public class E {

    public static void main(String[] args) {

        ClassA a= new ClassA();
        InterfaceA ia= a;
        System.out.println(a.method(10));


        ClassB b= new ClassB();
        InterfaceA ib= b;
        System.out.println(b.method(5));
    }

}