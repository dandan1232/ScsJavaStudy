package online.danbao.ScsJavaStudy.Exercise7.Exercise7_2;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 17:17
 * @description:
 */
public class AmericanPeople extends People{
    @Override
    public void speakHello(){
        System.out.println("你好，我是美国人！");
    }
    @Override
    public void averageHeight(){
        System.out.println("美国人身高是："+height);
    }
    @Override
    public void averageWeight(){
        System.out.println("美国人体重是："+weight);
    }
    public void amercianBoxing(){
        System.out.println("我会拳击：直拳、上勾拳");
    }
}