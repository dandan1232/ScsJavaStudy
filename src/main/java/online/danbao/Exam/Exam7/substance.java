package online.danbao.Exam.Exam7;

/**
 * @author: 蛋宝
 * @date: 2022/12/6 0:40
 * @description:
 * 7.	设计一个一个应用程序，求不同柱类体积。为了便于扩展采用面向抽象的编程思想来实现。
 * 画出设计类图，并编写相应的类以及主类（应用程序），并求出2种柱类的体积。
 */
public abstract class substance {//抽象类——物体
    public String getname(){
        return this.getClass().getSimpleName();
    }
    public abstract double getVolume();
}







