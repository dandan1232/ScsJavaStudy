package online.danbao.ScsJavaStudy.Ecercise8.Exercise8_4;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 19:47
 * @description:
 */
public class ConstructionBank extends Bank {
    double year;
    @Override
    public double computerInterest()
    {
        super.year=(int)Math.floor(this.year);

        double r=this.year-(int)Math.floor(this.year);
        int day=(int)(r*1000);//天数

        double yearInterest=super.computerInterest();
        double dayInterest=day*0.00012*savedMoney;
        interest=yearInterest+dayInterest;

        System.out.printf("%d元存在建设银行%d年零%d天的利息：%f元\n",savedMoney,super.year,day,interest);
        return interest;
    }
}