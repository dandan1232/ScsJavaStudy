package online.danbao.Exam.Exam6;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:18
 * @description:
 *  * （3）编写另一个类：ClassB来实现接口InterfaceA，实现int method(int n)接口方法时，要求计算n的阶乘（n!）；
 */
public class ClassB implements InterfaceA {

    @Override
    public int method(int n) {
        int sum = 1;
        for(int i = 1; i<=n;i++)
        {
            sum*=i;
        }
        return sum;

    }

}