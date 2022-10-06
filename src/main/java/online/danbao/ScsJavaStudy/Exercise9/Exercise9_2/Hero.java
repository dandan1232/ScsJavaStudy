package online.danbao.ScsJavaStudy.Exercise9.Exercise9_2;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:42
 * @description:
 */
public class Hero extends ActionCharacter implements CanSwin ,CanFly {
    private String name;
    public Hero(String name){
        this.name=name;
    }
    @Override
    public void swim() {
        System.out.println(name+" 游泳");
    }
    @Override
    public void fly() {
        System.out.println(name+" 飞行");
    }
    @Override
    public void fight(String emp){
        System.out.println(name+" fight "+emp);
    }
}