package online.danbao.ScsJavaStudy.Ecercise8.Exercise8_4;
/**
 * @author: 蛋宝
 * @date: 2022/10/5 19:48
 * @description:
 */

public class Test {
    public static void main(String args[]){
        //50000元在建设银行存5年零216天的利息。
        ConstructionBank bank1=new ConstructionBank();
        bank1.year=5.216;
        bank1.savedMoney=50000;
        bank1.computerInterest();

        //50000元在青岛银行存5年零216天的利息。
        BankOfGuangzhou bank2=new BankOfGuangzhou();
        bank2.year=5.216;
        bank2.savedMoney=50000;
        bank2.computerInterest();
        //利息差额
        System.out.printf("利息差额："+(bank1.interest-bank2.interest)+"\n\n");

        //8000元存在商业银行8年零236天的利息.
        ConstructionBank bank3=new ConstructionBank();
        bank3.year=8.236;
        bank3.savedMoney=80000;
        bank3.computerInterest();
    }
}