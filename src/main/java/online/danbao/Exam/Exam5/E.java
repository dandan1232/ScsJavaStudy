package online.danbao.Exam.Exam5;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 18:32
 * @description:
 * 在主类E的main方法中创建Monkey与People类的对象类测试这2个类的功能。
 */
public class E {
    public static void main(String[] args)
    {
        //实例化对象Monkey
        Monkey m = new Monkey("");
        m.speak();

        //实例化对象people
        People p = new People("");
        p.speak();
        p.think();


    }
}