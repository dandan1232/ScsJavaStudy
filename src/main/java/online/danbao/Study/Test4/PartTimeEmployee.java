package online.danbao.Study.Test4;

/**
 * @author: 蛋宝
 * @date: 2022/12/23 15:51
 * @description:
 */
public class PartTimeEmployee implements Employee {
    private String name;
    private int hours;
    private double hourlyWage;

    public PartTimeEmployee(String name, int hours, double hourlyWage) {
        this.name = name;
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return hours * hourlyWage;
    }

    @Override
    public String getInfo() {
        return "name:" + name + ";临时工，工时:" + hours + ",每小时工资:" + hourlyWage;
    }
}