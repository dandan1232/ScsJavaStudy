package online.danbao.ScsJavaStudy.Ecercise8.Exercise8_3;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 19:14
 * @description:
 */
abstract class Employee {

    public abstract double earnings();
}
//YearWorker对象按年领取薪水，
class YearWorker extends Employee {

    int n;
    double ns; // 工作年数与年薪
    YearWorker(int a, double b) // 构造函数
    {

        n = a;
        ns = b;
    }
    @Override
    public double earnings() {

        return n * ns;
    }
}
//MonthWorker按月领取薪水，
class MonthWorker extends Employee {

    int m;
    double ms; // 工作月数与月薪
    MonthWorker(int a, int b) {

        m = a;
        ms = b;
    }
    @Override
    public double earnings() {

        return m * ms;
    }
}
// WeekWorker按周领取薪水
class WeekWorker extends Employee {

    int w;
    double ws; // 工作周数与周薪
    WeekWorker(int a, double b) {

        w = a;
        ws = b;
    }
    @Override
    public double earnings() {

        return w * ws;
    }
}
class Company {

    double sum;
    Employee[] employee;
    Company(Employee[] employee) {

        this.employee = employee;
    }
    double pay() {

        for (int i = 0; i < 30; i++) {

            sum += employee[i].earnings();
        }
        return sum;
    }
}

class CompanySalary {

    public static void main(String[] args) {

        Employee[] employee = new Employee[30]; // 公司共有30名员工
// 把员工分为年薪、月薪、周薪员工
        for (int i = 0; i < employee.length; i++) {

            if (i % 3 == 0) {
                employee[i] = new WeekWorker(1, 1000); // 上转型对象
            }
            if (i % 3 == 1) {
                employee[i] = new MonthWorker(1, 10000);
            }
            if (i % 3 == 2) {
                employee[i] = new YearWorker(1, 200000);
            }
        }
        Company company = new Company(employee);
        System.out.println("该公司的薪水总额是" + company.pay() + "元");
    }
}
