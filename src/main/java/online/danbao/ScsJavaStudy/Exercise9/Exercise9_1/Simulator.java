package online.danbao.ScsJavaStudy.Exercise9.Exercise9_1;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:38
 * @description:
 */
public class Simulator {
    void playSound(Animal animal){
        System.out.println( animal.getAnimalName() + " may cry like this: ");
        animal.cry();
    }
}