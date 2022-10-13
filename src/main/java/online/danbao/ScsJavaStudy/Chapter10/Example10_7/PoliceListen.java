package online.danbao.ScsJavaStudy.Chapter10.Example10_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author: 蛋宝
 * @date: 2022/10/13 9:09
 * @description:
 */
public class PoliceListen implements ActionListener {
WindowNumber view;

    public void setView(WindowNumber view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n = 0, m = 0;
        String str = view.textInput.getText();
        if (!str.isEmpty()) {
            try {
                n = Integer.parseInt(str);
                m = n * n;
               view.textShow.setText(""+m);
            } catch (Exception exp) {
                view.textShow.setText("请输入数字");
            }
        }
    }
}