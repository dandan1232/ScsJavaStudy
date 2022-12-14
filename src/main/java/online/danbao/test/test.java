package online.danbao.test;

/**
 * @author: 蛋宝
 * @date: 2022/12/5 20:18
 * @description:
 */
public class test {
    public static void main(String[] args) {
        int a = 0;
        outer: for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j > i) {
                    continue outer;
                }
                a++;
            }
        }
        System.out.println(a);

//        long a[] = new long[6];
//        System.out.println(a[5]);

    }
}