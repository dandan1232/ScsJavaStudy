package online.danbao.ScsJavaStudy.Exercise9.Exercise9_3;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:49
 * @description:设计四个类分别实现此接口，完成加减乘除运算
 */
public class Add  implements Computer{

    @Override
    public int computer(int n, int m) {
        return n+m;
    }
}