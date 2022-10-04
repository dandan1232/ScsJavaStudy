package online.danbao.ScsJavaStudy.Chapter5.Example5_17;

public class LenovoCorp implements Advertisement { //LenovoCorpʵ��Avertisement�ӿ�
    @Override
    public void showAdvertisement() {
        System.out.println("**************");
        System.out.println("让世界变得很小");
        System.out.println("**************");
    }

    @Override
    public String getCorpName() {
        return "联想集团";
    }
}
