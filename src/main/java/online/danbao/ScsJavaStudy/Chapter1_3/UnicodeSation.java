package online.danbao.ScsJavaStudy.Chapter1_3;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 9:30
 * @description:参照例2-1编写一个应用程序，给出汉字“你”、“我”、“他”在Unicode表中的位置
 */
public class UnicodeSation {
    public static void main(String[] args) {
        char ch1='你';
        char ch2='我';
        char ch3='他';
        System.out.println("\""+ch1+"\"的位置:"+(int)ch1);
        System.out.println("\""+ch2+"\"的位置:"+(int)ch2);
        System.out.println("\""+ch3+"\"的位置:"+(int)ch3);
    }
}