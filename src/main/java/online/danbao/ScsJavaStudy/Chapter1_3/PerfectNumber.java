package online.danbao.ScsJavaStudy.Chapter1_3;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 20:03
 * @description:一个数如果恰好等于它的因子之和，这个数就称为完数。编写应用程序求1000之内的所有完数。
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int i, j;
        int sum = 0;
        System.out.println("1000之内的所有完数：");
        for (i = 1; i <= 1000; i++) {
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.print("   " + i);

            }
            sum = 0;
        }
    }
}