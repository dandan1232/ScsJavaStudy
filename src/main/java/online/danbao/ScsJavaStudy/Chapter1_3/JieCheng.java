package online.danbao.ScsJavaStudy.Chapter1_3;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 17:36
 * @description:编写应用程序求1！+2！+….+10!;
 */
public class JieCheng {
    public static void main(String[] args) {
        int i, j, m = 1, sum = 0;
        for (i = 1; i < 10; i++) {
            for (j = 1; j <= i; j++) {
                m = m * j;
            }
            sum += m;
            m = 1;
        }
        System.out.println("1!+2!+3!+....+10!的值是:" + sum);

    }

}