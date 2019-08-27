package swing;

import java.awt.*;

import javax.swing.*;

public class JPanelTest extends JFrame {
    /**
     * JPanel 面板
     */
    private static final long serialVersionUID = 1L;

    public JPanelTest() {
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1, 10, 10));   //将整个容器设置为两行一列的网格布局

        JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10)); //hgap:网格间的水平间隔, vgap:网格间的垂直间隔
        JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
        JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
        p1.add(new JButton("1")); //在面板中添加按钮
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p3.add(new JButton("6"));
        p3.add(new JButton("7"));
        p4.add(new JButton("8"));
        p4.add(new JButton("9"));
        c.add(p1); // 在容器中添加面板
        c.add(p2);
        c.add(p3);
        c.add(p4);
        setTitle("这个容器使用了面板"); //设置整个容器标题
        setSize(420, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
