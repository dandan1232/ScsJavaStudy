package online.danbao.ScsJavaStudy.Chapter5.Example5_13;

public class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("汪汪...汪汪");
    }

    @Override
    public String getAnimalName() {
        return "狗";
    }
}
