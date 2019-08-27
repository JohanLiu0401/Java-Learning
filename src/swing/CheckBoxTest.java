package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBoxTest extends JFrame {

    /**
     *  复选框组件
     */
    private static final long serialVersionUID = 1L;
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JTextArea jt = new JTextArea(3, 10);
    private JCheckBox jc1 = new JCheckBox("1");
    private JCheckBox jc2 = new JCheckBox("2");
    private JCheckBox jc3 = new JCheckBox("3");

    public CheckBoxTest() {
        Container c = getContentPane();

        c.setLayout(new BorderLayout());

        c.add(panel1, BorderLayout.NORTH);
        final JScrollPane scrollPane = new JScrollPane(jt);
        panel1.add(scrollPane);

        c.add(panel2, BorderLayout.SOUTH);
        panel2.add(jc1);
        jc1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jc1.isSelected())
                    jt.append("选中1\n"); //在文本域添加文字
            }
        });

        panel2.add(jc2);
        jc2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jc2.isSelected())
                    jt.append("选中2\n");
            }
        });

        panel2.add(jc3);
        jc3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jc3.isSelected())
                    jt.append("选中3\n");
            }
        });

        setSize(200, 160);
        setVisible(true);
        setTitle("复选框测试");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxTest();

    }

}
