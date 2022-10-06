package online.danbao.ScsJavaStudy.Exercise9.Exercise9_3;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 19:49
 * @description:
 * 设计一个类UseCompute，含有方法：
 * public void useCom(Compute com, int one, int two)
 * 此方法要求能够：
 * 1．用传递过来的对象调用computer方法完成运算
 * 2．输出运算的结果
 */

public class UseCompute {

    public static void useCom(Computer com,int one,int two){
        System.out.println( "调用的类为："+com.getClass().getName()+" 得到的结果为: "+com.computer(one,two));

    }
}
