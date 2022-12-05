package online.danbao.Exam.Exam4;


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
