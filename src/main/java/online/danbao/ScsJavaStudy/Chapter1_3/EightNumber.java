package online.danbao.ScsJavaStudy.Chapter1_3;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 20:09
 * @description:编写应用程序，使用for循环语句计算8+88+888+……前10项之和。
 */
public class EightNumber {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        int n = 8;
        int m = 8;
        for (i = 1; i <= 10; i++) {
            sum = sum + m;
            n = n * 10;
            m = m + n;
        }
        System.out.println("算8+88+888+……前10项之和:" + sum);
    }


}