package online.danbao.ScsJavaStudy.Chapter5.Example5_13;

public class Application {
   public static void main(String args[]) {
      MobileTelephone telephone = new MobileTelephone();
      SIM sim=new SIMOfChinaMobile();
      sim.setNumber("11657839412");
      telephone.useSIM(sim);
      telephone.showMess();
      sim=new SIMOfChinaUnicom();
      sim.setNumber("18675281923");
      telephone.useSIM(sim);
      telephone.showMess();
   }
}
