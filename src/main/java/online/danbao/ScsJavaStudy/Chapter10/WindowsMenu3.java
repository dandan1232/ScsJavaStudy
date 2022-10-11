package online.danbao.ScsJavaStudy.Chapter10;

import javax.swing.*;

/**
 * @author: 蛋宝
 * @date: 2022/10/11 11:30
 * @description:
 */
public class WindowsMenu3 extends JFrame {
    JMenuBar bar;
    JMenu cd;
    JMenuItem cx;

    WindowsMenu3(String s, int a, int b, int c, int d) {
        setTitle(s);
        setBounds(a,b,c,d);
        bar=new JMenuBar();
        cd=new JMenu("基本信息维护");
        cx = new JMenuItem("查询");
        cd.add(cx);
        bar.add(cd);
        this.setJMenuBar(bar);
        this.setVisible(true);
    }
}