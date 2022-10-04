package online.danbao.ScsJavaStudy.Chapter5.Example5_13;

public class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("喵喵...喵喵");
    }

    @Override
    public String getAnimalName() {
        return "猫";
    }
}
