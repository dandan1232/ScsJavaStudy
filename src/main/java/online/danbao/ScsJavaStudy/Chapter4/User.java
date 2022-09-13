package online.danbao.ScsJavaStudy.Chapter4;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 20:36
 * @description: 1)	编写一个Java应用程序：该程序中有两个类：Vehicle（机动车）和User（主类）
 * 2)	Veihicle：有一个double型变量speed表示速度；一个int型变量power表示功率。
 * 机动车有这些功能：加速speedUp(double s)和减速speedDown(double d)，
 * 获取速度getSpeed(),设置功率setPower(int p)、获取功率getPower()的方法；
 * 3)	请画出机动车的UML图
 * 4)	在主类User的main()方法中用Vehicle类创建对象，并让该对象调用方法设置功率，演示加速和减速的功能。
 */
public class User {
    public static void main(String[] args) { //创建对象
        Vehicle v = new Vehicle(); //赋值
        v.speed = 36;
        v.power = 12; //调用方法
        v.speedUp(2);
        v.speedDown(4);
        v.setPower(299);
        int power = v.getPower();
        System.out.println(power);
    }
}

class Vehicle {
    double speed;
    int power;

    void speedUp(int s) {
        this.speed += s;
        System.out.println("加速了" + s + ",此时速度" + this.speed);
    }

    void speedDown(int d) {
        this.speed -= d;
        System.out.println("减速了" + d + ",此时速度" + this.speed);
    }

    void setPower(int p) {
        this.power = p;
        System.out.println("设置功率成功,此时功率" + this.power);
    }

    int getPower() {
        return this.power;
    }

}