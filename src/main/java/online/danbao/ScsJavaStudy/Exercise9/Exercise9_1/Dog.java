package online.danbao.ScsJavaStudy.Exercise9.Exercise9_1;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:38
 * @description:
 */
public class Dog extends Animal {
    String name;

    Dog(String name){
        this.name=name;
    }

    void cry() {
        System.out.println("汪汪汪~");
    }

    String getAnimalName() {
        return name;
    }
}