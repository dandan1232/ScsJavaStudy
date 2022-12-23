package online.danbao.Study.Test2;

import online.danbao.Study.Test2.Cylinder;

import java.text.DecimalFormat;

/**
 * @author: 蛋宝
 * @date: 2022/12/23 14:16
 * @description:
 */
//测试类
public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1, 1);
        // 输出圆柱体的信息
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("圆柱体（1,1）的体积为" + df.format(cylinder.getVolume()) + "，表面积为" + df.format(cylinder.getSurfaceArea()));
    }
}