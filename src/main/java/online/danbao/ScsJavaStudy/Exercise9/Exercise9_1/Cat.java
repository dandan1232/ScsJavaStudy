package online.danbao.ScsJavaStudy.Exercise9.Exercise9_1;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:37
 * @description:
 */
public class Cat extends Animal {
    String name;

    Cat(String name){
        this.name=name;
    }

    void cry() {
        System.out.println("喵喵喵~");
    }

    String getAnimalName() {
        return name;
    }
}