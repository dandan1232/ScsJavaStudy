package online.danbao.ScsJavaStudy.Chapter5.Example5_17;

public class PhilipsCorp implements Advertisement { //PhilipsCorpʵ��Avertisement�ӿ�
   @Override
   public void showAdvertisement(){
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("没有最好，只有更好");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
   }
   @Override
   public String getCorpName() {
      return "飞利浦" ;
   }
}
