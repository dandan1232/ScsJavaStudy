package online.danbao.Study.Test4;

/**
 * @author: 蛋宝
 * @date: 2022/12/23 15:50
 * @description:
 */
public class FullTimeEmployee implements Employee {
    private String name;
    private int age;
    private double baseSalary;

    public FullTimeEmployee(String name, int age, double baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 50 * age;
    }

    @Override
    public String getInfo() {
        return "name:" + name + ";正式工,工龄;" + age + ",基本月薪:" + baseSalary;
    }
}


