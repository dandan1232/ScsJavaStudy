package online.danbao.Exam.Exam2;

/**
 * @author: 蛋宝
 * @date: 2022/9/13 16:30
 * @description: 创建主类：
 * 创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
 * 让该对象调用成员方法：
 * 说出“你好！”
 * 计算23+45的值
 * 将名字改为“李四”
 */
public class Action {
    public static void main(String[] args) {
        People p = new People();
        p.setName("张三");
        p.setAge(18);
        p.setSex("男");
        p.setHeight(1.80);

        System.out.println("姓名:" + p.getName());

        System.out.println("年龄：" + p.getAge());

        System.out.println("性别：" + p.getSex());

        System.out.println("身高：" + p.getHeight());

        System.out.println("他说：" + p.getsay());

        System.out.println("23+45=" + p.getAccount(23, 45));


        p.setName("李四");

        System.out.println("姓名改为：" + p.getName());

    }
}