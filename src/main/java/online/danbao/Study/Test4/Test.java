package online.danbao.Study.Test4;

/**
 * @author: 蛋宝
 * @date: 2022/12/23 15:50
 * @description:
 */
public class Test {
    public static void printSalary(Employee employee) {
        System.out.println(employee.getInfo() + " 工资：" + employee.calculateSalary());
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("aaa", 30, 1000),
                new PartTimeEmployee("bbb", 100, 30)
        };
        for (Employee employee : employees) {
            printSalary(employee);
        }
    }
}
