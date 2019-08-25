package swing;

import java.awt.*;

import javax.swing.*;

public class AbsolutePosition extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public AbsolutePosition() {
        setTitle("本窗体使用流布局管理器");
        setLayout(null);
        setBounds(0, 0, 200, 150);
        Container c = getContentPane();
        JButton b1 = new JButton("��ť1");
        JButton b2 = new JButton("��ť2");
        b1.setBounds(10, 30, 80, 30);
        b2.setBounds(60, 70, 100, 20);
        c.add(b1);
        c.add(b2);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
