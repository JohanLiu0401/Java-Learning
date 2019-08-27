package swing;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonTest extends JFrame {
    public JRadioButtonTest(){
        Container c = getContentPane();
        JRadioButton jr1 = new JRadioButton("1");
        JRadioButton jr2 = new JRadioButton("2");
        JRadioButton jr3 = new JRadioButton("3");
        ButtonGroup group = new ButtonGroup();
        group.add(jr1);
        group.add(jr2);
        group.add(jr3);
        c.add(jr1);
        c.add(jr2);
        c.add(jr3);
        setTitle("JRadioButton");
        c.setLayout(new FlowLayout(1,10,10));
        setBounds(0,0,200,150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }




    public static void main(String[] args){
        new JRadioButtonTest();
    }
}
