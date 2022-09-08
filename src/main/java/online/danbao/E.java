package online.danbao;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 10:20
 * @description:运行以下程序，理解程序代码。
 */
public class E {
    char x = '你', y = 'e', z = '吃';
    public static void main(String[] args) {
        int s3 = '苹' + '果';
        char s4 = (char) s3;
        //输出s3的Unicode值
        System.out.println(s3);
        char x = '你', y, z;
        //char x='你',y='e',z='吃';
        //x > 'A'条件成立
        if (x > 'A') {
            //y赋值为'苹'
            y = '苹';
            //z赋值为'果'
            z = '果';
        } else
            //else条件不成立,这里不执行
            y = '酸';
        //因为没加{}，else只到上面那句为止，这句会执行，z赋值为'甜'
        z = '甜';
        //输出x值：你，输出y值：苹，输出z值：甜
        System.out.print(x + "," + y + "'" + z);
    }
}
