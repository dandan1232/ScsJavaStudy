package online.danbao.ScsJavaStudy.Exercise10;

import java.util.Scanner;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 20:04
 * @description:
 */
public class Exercise10_1 {

    public static void main(String arg[]) {
        System.out.println("请输入若干数字（大于0和小于100），并输入end结束");
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            assert x >= 0 && x <= 100 : "数据不合理";//判断条件为true时，程序继续运行。
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d个数的和为%f\n", m, sum);
        System.out.printf("%d个数的平均值是%f\n", m, sum / m);
    }

}