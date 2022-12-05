package online.danbao.Exam.Exam4;



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
