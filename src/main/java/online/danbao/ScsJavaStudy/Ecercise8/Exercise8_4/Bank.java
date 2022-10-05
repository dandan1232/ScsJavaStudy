package online.danbao.ScsJavaStudy.Ecercise8.Exercise8_4;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 19:47
 * @description:
 */
public class Bank {
    int savedMoney;
    int year;
    double interest;

    double computerInterest() {
        this.interest = this.year*0.035*this.savedMoney;
        return interest;
    }
}