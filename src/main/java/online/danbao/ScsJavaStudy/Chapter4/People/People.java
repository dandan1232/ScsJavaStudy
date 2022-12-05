package online.danbao.ScsJavaStudy.Chapter4.People;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 16:27
 * @description: 创建一个叫做People的类：
 * 属性：姓名、年龄、性别、身高
 * 行为：说话、计算加法、改名
 * 编写能为所有属性赋值的构造方法；
 */

public class People {
    private String name;
    private int age;
    private String sex;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getsay() {
        return "你好";
    }

    public int getAccount(int a, int b) {
        return a + b;
    }

}