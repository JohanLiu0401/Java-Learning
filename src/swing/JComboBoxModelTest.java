package swing;

import java.awt.*;

import javax.swing.*;

public class JComboBoxModelTest extends JFrame {
    /**
     * 下拉列表框组件
     */
    private static final long serialVersionUID = 1L;
    JComboBox<String> jc = new JComboBox<>(new MyComboBox()); //此处应用了 JDK 7 的新特性
    // 下拉列表框中的内容被封装在ComboBoxModel类型里
    JLabel jl = new JLabel("请选择证件:");

    public JComboBoxModelTest() {
        setSize(new Dimension(160, 180));
        setVisible(true);
        setTitle("下拉列表框组件测试");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(jl);
        cp.add(jc);
    }

    public static void main(String[] args) {
        new JComboBoxModelTest();
    }
}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String selecteditem = null;
    String[] test = { "身份证", "军人证", "学生证", "工作证" };

    public String getElementAt(int index) {
        return test[index];
    }

    public int getSize() {
        return test.length;
    }

    public void setSelectedItem(Object item) {
        selecteditem = (String) item;
    }

    public Object getSelectedItem() {
        return selecteditem;
    }

//    public int getIndex() {
//        for (int i = 0; i < test.length; i++) {
//            if (test[i].equals(getSelectedItem()))
//                return i;
//        }
//        return 0;
//    }
}
