package online.danbao.Exam.Exam13;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 19:54
 * @description:分别用do-while和for循环计算1+1/2!+1/3!+…的前30项和
 */
public class circulation2 {
    //do-while
    public static void main(String[] args) {
        int i = 1;
        float j = 1;
        double sum = 0;
        do {
            j = j * i;
            i++;
            sum = sum + 1 / j;
        } while (i <= 30);
        System.out.println("do-while循环：" + "1+1/2!+1/3!+…的前30项和:" + sum);
    }
}