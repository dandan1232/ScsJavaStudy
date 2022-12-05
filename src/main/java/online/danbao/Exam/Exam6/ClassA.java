package online.danbao.Exam.Exam6;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:16
 * @description:
 * * （2）编写一个类：ClassA来实现接口InterfaceA，实现int method(int n)接口方法时，要求计算1到n的和；
 */
public class ClassA implements InterfaceA {

    @Override
    public int method(int n) {
        int sum = 0;
        for(int i = 0; i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }

}