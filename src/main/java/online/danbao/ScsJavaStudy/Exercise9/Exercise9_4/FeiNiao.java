package online.danbao.ScsJavaStudy.Exercise9.Exercise9_4;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:57
 * @description:（2）分别定义类飞机和鸟，实现CanFly接口。
 */
public class FeiNiao implements CanFly{
    @Override
    public void fly() {
        System.out.println("鸟儿可以飞");
    }
    public void makeFly(){
        System.out.println("鸟儿在飞翔......");
    }
}
