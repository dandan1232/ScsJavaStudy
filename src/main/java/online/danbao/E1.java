package online.danbao;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 17:21
 * @description:运行以下程序，调整break语句位置或注释break语句，理解switch和break语句作用；
 */
public class E1 {
    public static void main(String[] args) {
        char c = '\0';
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    c = 'J';
                    System.out.print(c);
                case 2:
                    c = 'e';
                    System.out.print(c);
//                    break;
                case 3:
                    c = 'p';
                    System.out.print(c);
                default:
                    System.out.print("好");
            }
        }
    }
}

