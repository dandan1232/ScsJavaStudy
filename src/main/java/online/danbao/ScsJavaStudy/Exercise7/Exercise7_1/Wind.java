package online.danbao.ScsJavaStudy.Exercise7.Exercise7_1;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 15:48
 * @description:
 */
public class Wind extends Instrument{
    @Override
    public void play(){
        System.out.println("弹奏Wind");
    }
    public void play2(){
        System.out.println("调用wind的play2");
    }
}