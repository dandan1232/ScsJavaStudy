package online.danbao.ScsJavaStudy.Chapter1_3;

/**
 * @author: 蛋宝
 * @date: 2022/9/6 10:42
 * @description: 简单程序
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("这是一个简单的Java应用程序");
        Student stu = new Student();
        stu.speak("We are students");
    }
}
class Student{
    public void speak(String s) {
        System.out.println(s);
    }
}