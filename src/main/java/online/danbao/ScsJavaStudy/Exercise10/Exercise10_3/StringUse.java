package online.danbao.ScsJavaStudy.Exercise10.Exercise10_3;

/**
 * @author: 蛋宝
 * @date: 2022/10/6 20:26
 * @description:
 * (1）字符串调用public String toUpperCase()方法返回一个字符串，该字符串把当前字符串中的小写字母变成大写字母;
 * 字符串调用public String toLowerCase()方法返回一个字符串，该字符串把当前字符串中的大写字母变成小写字母。
 * String类的 public String concat(String str)方法返回一个字符串，该字符串是把调用该方法的字符串与参数指定的字符串连接。
 * 编写一个程序，练习使用这3个方法。
 */
public class StringUse {
    public static void main(String[] args) {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());//把当前字母串中的小写字母转换为大写字母
        System.out.println(txt.toLowerCase());//把当前字符串中的大写字母转换为小写字母
        System.out.println(txt.concat("123"));//字符串调用该方法与参数的字符进行连接
    }


}