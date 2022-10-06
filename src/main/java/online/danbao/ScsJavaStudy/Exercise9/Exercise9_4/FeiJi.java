package online.danbao.ScsJavaStudy.Exercise9.Exercise9_4;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:57
 * @description:（2）分别定义类飞机和鸟，实现CanFly接口。
 */

public class FeiJi implements CanFly {
    @Override
    public void fly() {
        System.out.println("飞机可以飞");
    }
    public void makeFly(){
        System.out.println("飞机起飞......");
    }
}
