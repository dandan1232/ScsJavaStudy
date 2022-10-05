package online.danbao.ScsJavaStudy.Exercise7.Exercise7_1;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 15:51
 * @description:
 */
public class Music {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        i.play();
        Wind w = new Wind();
        w.play();
        w.play2();
        Brass b = new Brass();
        b.play();
        b.play2();

    }
}