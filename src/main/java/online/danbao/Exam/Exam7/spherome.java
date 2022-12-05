package online.danbao.Exam.Exam7;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:41
 * @description:
 */
public class spherome extends substance {//实体类——球体
    private double radius;
    public spherome(double radius){this.radius=radius;}
    @Override
    public double getVolume() {
        return Math.PI*Math.pow(radius,3)*((double)4/3);
    }
}