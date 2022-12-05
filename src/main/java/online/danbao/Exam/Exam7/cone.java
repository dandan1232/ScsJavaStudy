package online.danbao.Exam.Exam7;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:41
 * @description:
 */
public class cone extends substance{//实体类——圆锥体
    private double radius;
    private double height;
    public cone(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    @Override
    public double getVolume() {
        return Math.PI*Math.pow(radius,2)*height*((double)1/3);
    }
}