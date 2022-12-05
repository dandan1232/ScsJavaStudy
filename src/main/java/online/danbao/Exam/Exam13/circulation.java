package online.danbao.Exam.Exam13;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 19:45
 * @description:分别用do-while和for循环计算1+1/2!+1/3!+…的前30项和
 */
public class circulation {
    //for循环
    public static void main(String[] args) {
        int i;
        int j;
        float a = 1;
        double sum = 0;
        for (i = 1; i <= 30; i++) {
            for (j = 1; j <= i; j++) {
                a = a * j;
            }
            sum = sum + 1 / a;
            a = 1;
        }
        System.out.println("for循环:"+"1+1/2!+1/3!+…的前30项和:" + sum);
    }
}
