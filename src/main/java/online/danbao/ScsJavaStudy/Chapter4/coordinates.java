package online.danbao.ScsJavaStudy.Chapter4;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 14:50
 * @description: p1p2应用，xy的坐标
 */
public class coordinates {
    public static void main(String[] args) {
        Point p1,p2;
        p1=new Point();
        p2=new Point();
        System.out.println("p1的引用："+p1);
        System.out.println("p2的引用："+p2);
        p1.setXY(131,234);
        p2.setXY(-132,-394);
        System.out.println("p1的x，y坐标："+p1.x+","+p1.y);
        System.out.println("p2的x，y坐标："+p2.x+","+p2.y);
        p1=p2;
        System.out.println("将p2的引用赋给p1后：");
        System.out.println("p1的引用："+p1);
        System.out.println("p2的引用："+p2);
        System.out.println("p1的x，y坐标："+p1.x+","+p1.y);
        System.out.println("p2的x，y坐标："+p2.x+","+p2.y);

    }

}

class Point{
    int x,y;
    void setXY(int m,int n){
        x=m;
        y=n;
    }
}
