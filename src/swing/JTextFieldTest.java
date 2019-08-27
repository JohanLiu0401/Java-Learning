package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JTextFieldTest extends JFrame{

    /**
     * 文本框
     */

    private static final long serialVersionUID = 1L;

    public JTextFieldTest(){
        setSize(250,100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp=getContentPane();
        getContentPane().setLayout(new FlowLayout());
        final JTextField jt=new JTextField("默认文字",20);
        final JButton jb=new JButton("清除");
        cp.add(jt);
        cp.add(jb);
        jt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jt.setText("按下enter");
            }
        });
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                jt.setText("");
                jt.requestFocus();
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTextFieldTest();
    }
}

