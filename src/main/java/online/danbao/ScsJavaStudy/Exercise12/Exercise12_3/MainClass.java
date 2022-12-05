package online.danbao.ScsJavaStudy.Exercise12.Exercise12_3;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 蛋宝
 * @date: 2022/11/22 14:23
 * @description:
 */
public class MainClass {

    public static void main(String[] args) {
        Font f =  new Font("宋体", Font.PLAIN,12);
        UIManager.put("Label.font",f);
        UIManager.put("Label.foreground",Color.black);
        UIManager.put("Button.font",f);
        UIManager.put("Menu.font",f);
        UIManager.put("MenuItem.font",f);
        UIManager.put("List.font",f);
        UIManager.put("CheckBox.font",f);
        UIManager.put("RadioButton.font",f);
        UIManager.put("ComboBox.font",f);
        UIManager.put("TextArea.font",f);
        UIManager.put("EditorPane.font",f);
        UIManager.put("ScrollPane.font",f);
        UIManager.put("ToolTip.font",f);
        UIManager.put("TextField.font",f);
        UIManager.put("TableHeader.font",f);
        UIManager.put("Table.font",f);
        ComputerJFrame frame;
        frame = new ComputerJFrame("算术测试");
    }
}