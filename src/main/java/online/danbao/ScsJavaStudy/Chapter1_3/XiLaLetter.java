package online.danbao.ScsJavaStudy.Chapter1_3;

/**
 * @author: 蛋宝
 * @date: 2022/9/8 9:36
 * @description:
 * （2）编写一个应用程序，输出全部的希腊字母；提示：先找到希腊首字母α和最后一个字母ω在Unicode表中的位置，通过循环输出。
 * 要观察一个字符在Unicode字符集中的顺序位置，必须使用int类型转换。
 */
public class XiLaLetter {

    public static void main(String[] args) {
        int first,last;
        char firstG='α';
        char lastG='ω';
        System.out.println("输出希腊字母：");
        for (int i=firstG;i<=lastG;++i){
            char XiLaLetter;
            XiLaLetter=(char)i;
//            System.out.println(" "+XiLaLetter);
            System.out.println("\""+XiLaLetter+"\"的位置："+(int)i);
        }
    }

}