package online.danbao.ScsJavaStudy.Chapter5.Example5_17;

public class Example5_17 {
   public static void main(String args[]) {
      AdvertisementBoard board = new AdvertisementBoard();
      board.setAdvertisement(new LenovoCorp());
      board.show();  
      board.setAdvertisement(new PhilipsCorp());
      board.show();  
   }
}
