package online.danbao.ScsJavaStudy.Exercise7.Exercise7_2;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 17:19
 * @description:
 */
public class Test {

    public static void main(String[] args) {

        ChinaPeople C=new ChinaPeople();
        C.height=168;
        C.weight=47;
        C.speakHello();
        C.averageHeight();
        C.averageWeight();
        C.chinaGongfu();

        AmericanPeople M =new AmericanPeople();
        M.height=180;
        M.weight=85;
        M.speakHello();
        M.averageHeight();
        M.averageWeight();
        M.amercianBoxing();


    }
}