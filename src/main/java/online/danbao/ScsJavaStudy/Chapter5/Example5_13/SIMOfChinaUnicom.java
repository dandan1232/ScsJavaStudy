package online.danbao.ScsJavaStudy.Chapter5.Example5_13;

public class SIMOfChinaUnicom extends SIM {
    String number;
    @Override
    public void setNumber(String n) {
        number = n;
    }
    @Override
    public String giveNumber() {
        return number;
    }
    @Override
    public String giveCorpName() {
        return "中国联通";
    }
}