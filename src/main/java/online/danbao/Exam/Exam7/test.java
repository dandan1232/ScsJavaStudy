package online.danbao.Exam.Exam7;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:42
 * @description:
 */

public class test {//测试
    public static void main(String[] args) {
        //实体类——球体
        spherome s1=new spherome(1);
        System.out.println(s1.getname()+" "+s1.getVolume());
        //实体类——圆柱体
        cylinder c1=new cylinder(1,1);
        System.out.println(c1.getname()+" "+c1.getVolume());
        //实体类——圆锥体
        cone c2=new cone(1,1);
        System.out.println(c2.getname()+" "+c2.getVolume());
    }
}
