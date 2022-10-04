package online.danbao.ScsJavaStudy.Exercise5.Exercise5_5;

/**
 * @author: 蛋宝
 * @date: 2022/10/4 21:52
 * @description: g)	在main方法中，用TV类创建一个对象haierTV，然后用Family类创建一个对象myFamily,
 * 并将haierTV的引用传递给myFamily对象的成员变量 homeTV。
 */
public class MainClass {
    public static void main(String[] args) {
        TV haier = new TV();
        haier.setTelevesion(1);
        Family zhangsanFamily = new Family();
        zhangsanFamily.setHomeTV(haier);
        System.out.println("当前电视所在的频道数为" + zhangsanFamily.getHomeTvNumber());//1、当前电视所在的频道数。
        System.out.println("当前收看的频道名称为：" + zhangsanFamily.getHomeTV());//2、系统提示zhangsanFamily当前看的频道名称。
        haier.setTelevesion(2);//3、zhangsanFamily更换频道，输出频道数。
        System.out.println("当前电视所在的频道数为" + zhangsanFamily.getHomeTvNumber());
        System.out.println("当前收看的频道名称为：" + zhangsanFamily.getHomeTV());//4、更改后的频道名称。

    }
}