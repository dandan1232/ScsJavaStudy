package online.danbao.ScsJavaStudy.Chapter5.Example5_13;

public class Simulator {
    public void playSound(Animal animal) {
        System.out.print("现在播放" + animal.getAnimalName() + "类的声音：");
        animal.cry();
    }
}
