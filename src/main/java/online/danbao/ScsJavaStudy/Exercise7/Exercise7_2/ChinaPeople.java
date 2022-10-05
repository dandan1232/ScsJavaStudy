package online.danbao.ScsJavaStudy.Exercise7.Exercise7_2;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 17:17
 * @description:
 */
public class ChinaPeople extends People{
    @Override
    public void speakHello(){
        System.out.println("你好，我是中国人！");
    }
    @Override
    public void averageHeight(){
        System.out.println("中国人身高是："+height);
    }
    @Override
    public void averageWeight(){
        System.out.println("中国人体重是："+weight);
    }
    public void chinaGongfu(){
        System.out.println("我会功夫：坐如钟，站如松，卧如弓！");
    }
}