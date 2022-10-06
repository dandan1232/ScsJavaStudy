package online.danbao.ScsJavaStudy.Exercise9.Exercise9_2;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:42
 * @description:
 */
public class Adventure {
    public static void main(String[] args) {
        Hero hb = new Hero("钢铁侠");
        hb.swim();
        hb.fight("怪兽");
        hb.fly();
        CanFly cf =hb;
        cf.fly();
        CanSwin cs =hb;
        hb.swim();
        ActionCharacter ac =hb;
        hb.fight("奥特曼");
        hb.speak("my power is money");

    }
}