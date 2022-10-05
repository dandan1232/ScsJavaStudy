package online.danbao.ScsJavaStudy.Exercise7.Exercise7_1;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 15:50
 * @description:
 */
public class Brass extends Instrument{
    @Override
    public void play(){
        System.out.println("弹奏brass");
    }

    public void play2(){
        System.out.println("调用brass的play2");
    }
}