package online.danbao.ScsJavaStudy.Exercise9.Exercise9_4;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:57
 * @description:
 * （3）定义一个测试类，测试飞机和鸟，在main方法中创建飞机对象和鸟对象，
 * 再定义一个makeFly()方法，其中让会飞的事物飞。并在main方法中调用该方法，
 * 让飞机和鸟起飞。
 */

public class Test {
    public static void main(String[] args) {
        CanFly feiJi = new FeiJi();
        CanFly feiNiao = new FeiNiao();
        feiJi.fly();
        feiNiao.fly();
        if (feiJi instanceof FeiJi){
            FeiJi fei = (FeiJi)feiJi;
            fei.makeFly();
        }
    }
}
