package online.danbao.Exam.Exam3;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 17:16
 * @description:
 */
public class People {
    protected double height;
    protected double weight;

    public void speakHello(){
        System.out.println("你好");
    }
    public void averageHeight(){
        System.out.println("身高是："+height);
    }
    public void averageWeight(){
        System.out.println("体重是："+weight);
    }
}