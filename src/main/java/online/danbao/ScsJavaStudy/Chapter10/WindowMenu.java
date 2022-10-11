package online.danbao.ScsJavaStudy.Chapter10;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * @author: 蛋宝
 * @date: 2022/10/11 10:51
 * @description:
 */
public class WindowMenu extends JFrame {
    JMenuBar menubar;
    JMenu menu, subMenu;
    JMenuItem itemLiterature, itemCooking, itemChecking;

    public WindowMenu() {
    }

    public WindowMenu(String s, int x, int y, int w, int h) {
        this.init(s);
        this.setLocation(x, y);
        this.setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    void init(String s) {
        this.setTitle(s);
        menubar = new JMenuBar();
        menu = new JMenu("菜单");
        subMenu = new JMenu("体育话题");
        itemLiterature = new JMenuItem("文学话题");
        itemCooking = new JMenuItem("烹饪话题");
        itemLiterature.setAccelerator(KeyStroke.getKeyStroke('A'));
        itemCooking.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        //menu.add(itemChecking);
        //menu.addSeparator();
        menu.add(itemLiterature);
        menu.addSeparator();
        menu.add(itemCooking);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("足球", new ImageIcon()));
        subMenu.add(new JMenuItem("篮球", new ImageIcon()));
        menubar.add(itemChecking);
        menubar.add(menu);
        this.setJMenuBar(menubar);
        this.setVisible(true);


    }

}