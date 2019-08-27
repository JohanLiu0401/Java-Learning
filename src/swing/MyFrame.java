package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyJDialog extends JDialog {
    /**
     * 对话框
     */

    private static final long serialVersionUID = 1L;

    public MyJDialog(MyFrame frame) {
        super(frame, "第一个 JDialog 窗体", true);
        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120, 120, 100, 100);
    }
}

public class MyFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String args[]) {
        new MyFrame();
    }

    public MyFrame() {
        Container container = getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("这是一个 JFrame 窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10, 10, 100, 21);
        bl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);

        container.add(bl);
        container.setBackground(Color.white);
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
