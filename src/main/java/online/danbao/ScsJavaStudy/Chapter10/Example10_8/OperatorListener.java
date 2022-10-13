package online.danbao.ScsJavaStudy.Chapter10.Example10_8;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author: 蛋宝
 * @date: 2022/10/13 9:40
 * @description:
 */
public class OperatorListener implements ItemListener {
    WindowView view;

    public void setView(WindowView view) {
        this.view = view;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String fuhao = view.choiceFuhao.getSelectedItem().toString();
        view.computer.setFuhao(fuhao);

    }
}