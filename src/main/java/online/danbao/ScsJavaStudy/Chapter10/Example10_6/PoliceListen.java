package online.danbao.ScsJavaStudy.Chapter10.Example10_6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author: 蛋宝
 * @date: 2022/10/13 9:09
 * @description:
 */
public class PoliceListen implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        int n=0,m=0;
        String str = e.getActionCommand();
        try {
            n=Integer.parseInt(str);
            m=n*n;
            System.out.println(n+"的平方是:"+m);
        }
        catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}