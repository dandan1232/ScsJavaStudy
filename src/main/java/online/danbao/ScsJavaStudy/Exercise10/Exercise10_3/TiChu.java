package online.danbao.ScsJavaStudy.Exercise10.Exercise10_3;

import java.util.Scanner;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 20:23
 * @description:
 * (5）编写程序剔除一个字符串中的全部非数字字符，例如，将形如 ab123you 的非数字字符全部剔除,得到字符串12(参看例子10)。
 */
public class TiChu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=new String();
        s=in.nextLine();
        for(int index=0;index<s.length()-1;index++)
        {
            if(s.charAt(index)>=48&&s.charAt(index)<=57)
            {
                System.out.print(s.charAt(index));
            }

        }
    }
}