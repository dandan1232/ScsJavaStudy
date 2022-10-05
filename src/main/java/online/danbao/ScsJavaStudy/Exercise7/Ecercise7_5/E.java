package online.danbao.ScsJavaStudy.Exercise7.Ecercise7_5;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 18:48
 * @description:
 */
public class E {
    public static void main(String[] args) {

        //实例化三角形对象
        Sanjiao sj = new Sanjiao();
        System.out.println(sj.qiuZC(9, 2.2, 19));
        System.out.println(sj.qiuZC(5, 3.1, 4.1));


        //实例化矩形对象
        Jvxing jx= new Jvxing();
        System.out.println(jx.qiuZC(12, 21.6));
        System.out.println(jx.qiuZC(10, 0));

    }
}