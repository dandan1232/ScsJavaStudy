package online.danbao.ScsJavaStudy.Exercise7.Exercise7_3;

/**
 * @author: 蛋宝
 * @date: 2022/10/5 18:32
 * @description:
 * People类是Monkey类的子类，在People类中重写方法speak(),在speak方法
 * 中输出“小样的，不错嘛！会说话了！”的信息。
 * 在People类中新增方法void think()，在think方法中输出“别说话！认真思考！”
 * 的信息。
 */
public class People extends Monkey
{
    //构造方法
    People(String s)
    {
        super(s);
    }

    //重写父类方法speak
    @Override
    public void speak()
    {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think()
    {
        System.out.println("别说话，认真思考！");
    }
}