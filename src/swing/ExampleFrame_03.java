package swing;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExampleFrame_03 extends JFrame {

    /**
     * 网格组布局管理器
     */
    private static final long serialVersionUID = 1L;

    public static void main(String args[]) {
        ExampleFrame_03 frame = new ExampleFrame_03();
        frame.setVisible(true);
    }

    public ExampleFrame_03() {
        super();
        setTitle("网格组布局管理器");
        getContentPane().setLayout(new GridBagLayout());
        setBounds(100, 100, 500, 170); //设置窗口位置和大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JButton button = new JButton("A");
        final GridBagConstraints gridBagConstraints = new GridBagConstraints(); //新建 gridBagConstraints 对象来设置该组件的属性值
        gridBagConstraints.gridy = 0; //设置组件起始点所在单元格的行索引值
        gridBagConstraints.gridx = 0; //设置组件起始点所在单元格的列索引值
        gridBagConstraints.weightx = 10; //设置网格组的列对额外空间的分布方式
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL; //设置组件的填充方式
        getContentPane().add(button, gridBagConstraints);

        final JButton button_1 = new JButton("B");
        final GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
        gridBagConstraints_1.gridy = 0;
        gridBagConstraints_1.gridx = 1;
        gridBagConstraints_1.insets = new Insets(0, 5, 0, 0);//设置组件四周与单元格边缘之间的最小距离
        gridBagConstraints_1.weightx = 20;
        gridBagConstraints_1.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(button_1, gridBagConstraints_1);

        final JButton button_2 = new JButton("C");
        final GridBagConstraints gridBagConstraints_2 = new GridBagConstraints();
        gridBagConstraints_2.gridy = 0;
        gridBagConstraints_2.gridx = 2;
        gridBagConstraints_2.gridheight = 2; //设置组件占用网格数的行数
        gridBagConstraints_2.insets = new Insets(0, 5, 0, 0);
        gridBagConstraints_2.weightx = 30;

        gridBagConstraints_2.fill = GridBagConstraints.BOTH;
        getContentPane().add(button_2, gridBagConstraints_2);

        final JButton button_3 = new JButton("D");
        final GridBagConstraints gridBagConstraints_3 = new GridBagConstraints();
        gridBagConstraints_3.gridy = 0;
        gridBagConstraints_3.gridx = 3;
        gridBagConstraints_3.gridheight = 4;

        gridBagConstraints_3.insets = new Insets(0, 5, 0, 5);
        gridBagConstraints_3.weightx = 40;
        gridBagConstraints_3.fill = GridBagConstraints.BOTH;
        getContentPane().add(button_3, gridBagConstraints_3);

        final JButton button_4 = new JButton("E");
        final GridBagConstraints gridBagConstraints_4 = new GridBagConstraints();
        gridBagConstraints_4.gridy = 1;
        gridBagConstraints_4.gridx = 0;
        gridBagConstraints_4.gridwidth = 2;

        gridBagConstraints_4.insets = new Insets(5, 0, 0, 0);

        gridBagConstraints_4.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(button_4, gridBagConstraints_4);

        final JButton button_5 = new JButton("F");
        final GridBagConstraints gridBagConstraints_5 = new GridBagConstraints();
        gridBagConstraints_5.gridy = 2;
        gridBagConstraints_5.gridx = 0;
        gridBagConstraints_5.insets = new Insets(5, 0, 0, 0);
        gridBagConstraints_5.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(button_5, gridBagConstraints_5);

        final JButton button_6 = new JButton("G");
        final GridBagConstraints gridBagConstraints_6 = new GridBagConstraints();
        gridBagConstraints_6.gridy = 2;
        gridBagConstraints_6.gridx = 1;
        gridBagConstraints_6.gridwidth = 2;
        gridBagConstraints_6.gridheight = 2;
        gridBagConstraints_6.insets = new Insets(5, 5, 0, 0);
//        gridBagConstraints_6.fill = GridBagConstraints.BOTH;
		gridBagConstraints_6.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints_6.ipadx = 0;
		gridBagConstraints_6.anchor = GridBagConstraints.CENTER;
        getContentPane().add(button_6, gridBagConstraints_6);

        final JButton button_7 = new JButton("H");
        final GridBagConstraints gridBagConstraints_7 = new GridBagConstraints();
        gridBagConstraints_7.gridy = 3;
        gridBagConstraints_7.gridx = 0;
        gridBagConstraints_7.insets = new Insets(5, 0, 0, 0);
        gridBagConstraints_7.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(button_7, gridBagConstraints_7);
        //
    }

}
