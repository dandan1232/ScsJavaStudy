package online.danbao.Exam.Exam14;

import java.io.*;
import java.util.*;

/**14.	解析student.txt文件中的学生成绩，文本中内容如下。
“张三的成绩是72分，李四成绩是69分，刘小林成绩是95分。”*/

public class Example10_16 {
    public static void main(String args[]) {
        File file = new File("D:\\Study\\ScsJavaStudy\\src\\main\\java\\online\\danbao\\Exam\\Exam14\\student.txt");
        Scanner sc=null;
        int count=0;
        double sum=0;
        try { double score=0;
            sc = new Scanner(file);
            sc.useDelimiter("[^0123456789.]+");
            while(sc.hasNextDouble()){
                score=sc.nextDouble();
                count++;
                sum=sum+score;
                System.out.println(score);
            }
            double aver=sum/count;
            System.out.println("平均成绩:"+aver);
        }
        catch(Exception exp){
            System.out.println(exp);
        }
    }
}
