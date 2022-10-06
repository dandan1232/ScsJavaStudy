package online.danbao.ScsJavaStudy.Exercise9.Exercise9_2;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:43
 * @description:
 */
public abstract class ActionCharacter {
    abstract void fight(String emp);

    void speak(String s) {
        System.out.println(s);
    }
}