package online.danbao.ScsJavaStudy.Chapter5.Exercise5_10;

public class Application{
    public static void main(String args[]){
        Pillar pillar;
        Geometry bottom =null;
        pillar =new Pillar (bottom,100);  //null底的柱体
        System.out.println("体积"+pillar.getVolume());
        bottom=new Rectangle(12,22);
        pillar =new Pillar (bottom,58);  //pillar是具有矩形底的柱体
        System.out.println("体积"+pillar.getVolume());
        bottom=new Circle(10);
        pillar =new Pillar (bottom,58); //pillar是具有圆形底的柱体
        System.out.println("体积"+pillar.getVolume());
    }
}

