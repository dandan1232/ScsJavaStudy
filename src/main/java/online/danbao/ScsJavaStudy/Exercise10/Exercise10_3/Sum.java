package online.danbao.ScsJavaStudy.Exercise10.Exercise10_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 20:21
 * @description:
 * (6）使用Scanner类的实例解析字符串数学87分，物理76分，英语96分中的考试成绩，并计算出总成绩以及平均分数（参看例子13)。

 */
public class Sum {
    public static void main(String[] args) {
        String s = "数学87分， 物理76分，英语96分";
        String re = "[1234567890.]+" ;
        Pattern p = Pattern.compile(re) ;
        Matcher m = p.matcher(s) ;
        double sum = 0 ;
        while (m.find()) {
            String item = m.group() ;
            System.out.println(item) ;
            sum=sum+Double.parseDouble(item) ;
        }
        System.out.println("总成绩："+sum+",平均成绩为"+sum/3) ;
    }
}